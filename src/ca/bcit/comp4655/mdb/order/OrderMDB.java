package ca.bcit.comp4655.mdb.order;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import ca.bcit.comp4655.dto.order.OrderDTO;

@MessageDriven( 
	mappedName="jms/p2p/request" ,
	activationConfig=
	{
		@ActivationConfigProperty( propertyName="destinationType", propertyValue = "javax.jms.Queue" ),
		@ActivationConfigProperty( propertyName="destination", propertyValue="/queue/request/week11" ),
		@ActivationConfigProperty( propertyName="messageSelector", propertyValue= "orderAmount > 1000" ),
		@ActivationConfigProperty( propertyName="acknowledgeMode", propertyValue= "AUTO_ACKNOWLEDGE" )
	})
public class OrderMDB implements MessageListener 
{

	@Override
	public void onMessage( Message msg ) 
	{
		
		try 
		{
			ObjectMessage objMsg = ( ObjectMessage ) msg;
			OrderDTO order = ( OrderDTO ) objMsg.getObject();
			System.out.println ( "Order Received: " + order );
		}
		catch ( JMSException e )
		{
			e.printStackTrace();
		}
	}
	
}
