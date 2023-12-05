package client;

import org.eclipse.paho.client.mqttv3.*;

public class SensorSubscriber {
	
	public static void main(String[] args) {
		String subscriberId = "Subscriber_174";
		MqttClient subscriber = null;
		try {
			subscriber = new MqttClient(MyConstants.URI_BROKER,subscriberId);
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect(true);
		opts.setCleanSession(true);
		opts.setConnectionTimeout(10);
		try {
			subscriber.connect(opts);
		} catch (MqttSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			subscriber.subscribe(MyConstants.TOPIC_SENSOR, (topic, msg)->{
				System.out.println("Mensagem recebida: ["+msg+"] do topico: "+topic);
			});
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
