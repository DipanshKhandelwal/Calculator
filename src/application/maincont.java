package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label; 

public class maincont {
	@FXML
	private Label res;
	private long num1=0,num2;
	private String opt="";
	private boolean start = true;
	private model mode = new model();
	@FXML
	public void procnum(ActionEvent event)
	{
		if(start)
		{
			res.setText("");
			start=false;
		}
		
		String value = ((Button)event.getSource()).getText();
		res.setText(res.getText()+ value);
	}
	
	
	@FXML
	public void procopt(ActionEvent event)
	{
		String value = ((Button)event.getSource()).getText();
		if(!value.equals("="))
		{
		    if(!opt.isEmpty())return;
		    
		    opt = value;
		    num1= Long.parseLong(res.getText());
		    res.setText("");
		}else
		{  System.out.println("++");
			if(opt.isEmpty())return;
			
			num2=Long.parseLong(res.getText());
			long out ;
			out = mode.calc( num1, num2, opt);
			System.out.println(out);
			res.setText(String.valueOf(out));
			opt="";
			start = true;	
		}
		}
	}