package client;

import org.eclipse.paho.client.mqttv3.*;

public class SensorPublisher {
	
	private static MqttMessage createMessage(double value) {
		
		byte[] payload = String.format("T:%04.2f", value).getBytes();
		return new MqttMessage(payload);
	}
	
    public static void main(String[] args) {
		String publisherId = "Publicador_174";
		MqttClient publisher = null;
		try {
			publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect(true);
		opts.setCleanSession(true);
		opts.setConnectionTimeout(10);
		try {
			publisher.connect(opts);
		} catch (MqttSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sensor sensor = new Sensor();
		
		for (int i=0;i<100;i++)
		{
			double temperatura = sensor.readTemp();
			MqttMessage message = createMessage(temperatura);
			
			try {
				publisher.publish(MyConstants.TOPIC_SENSOR,message);
			} catch (MqttPersistenceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MqttException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			publisher.disconnect();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
