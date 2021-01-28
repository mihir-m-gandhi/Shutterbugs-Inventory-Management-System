import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class SB extends JFrame implements ActionListener{
	
	JPanel cards,Main,In,Out,Search,Display;
	
	Vector v=new Vector();
	Vector v2=new Vector();
	
	//elements on main page
	JLabel heading;
	JButton inButton;
	JButton outButton;
	JButton searchButton;
	JButton displayButton;
	JLabel developedBy;
	JLabel img;
	
	//elements on in page		//back and continue buttons to be added
	JLabel heading3;
	JLabel namel2;
	JLabel commentl;
	JTextField namet2;
	JTextField commentt;
	JTextField returned;
	JButton returnedButton;
	JButton back;
	JLabel img2;
		
	//elements on out page
	JLabel heading2;
	JLabel namel;
	JLabel cameral;
	JLabel lensl;
	JLabel tripodl;
	JLabel cardl;
	JLabel eventl;
	JTextField namet;
	JTextField camerat;
	JTextField lenst;
	JTextField tripodt;
	JTextField cardt;
	JTextField eventt;
	JTextField added;
	JButton addButton;
	JButton back2;
	JLabel img3;
	
	//element on display page
	/*JTextField table;
	JButton done;
	JLabel heading5;
	JButton back3;*/
	
	//element on search page
	JTextField sbyname;
	JTextField sbycam;
	JTextField sbylens;
	JButton search;
	JLabel heading4;
	JLabel namel3;
	JLabel cameral3;
	JLabel lensl3;
	JButton back4;
	JTextField result;
	JLabel img4;
	JLabel eventl2;
	JTextField sbyevent;
	
	//backend variables
	//String username="";
	CardLayout c;
	
	/*final JFileChooser fc = new JFileChooser();
	String filename="null";*/
	
	SB(String title)
	{
		super(title);
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );
		
		this.setSize(1000,900);
		this.setResizable(false);
		
		//Just pages
		Main=new JPanel();
		Main.setLayout(null);
		
		Out=new JPanel();
		Out.setLayout(null);
		
		In=new JPanel();
		In.setLayout(null);
		
		Search=new JPanel();
		Search.setLayout(null);
		
		/*Display=new JPanel();
		Display.setLayout(null);
		//End of just pages*/
		
		c = new CardLayout();
		cards = new JPanel();	//Making a new panel
		cards.setLayout(c);		
		this.add(cards);		//Adding cards declared above
		
		//Setting background colour
		Main.setBackground(Color.black);
		Out.setBackground(new Color(210,77,87));
		In.setBackground(new Color(89,170,227));
		Search.setBackground(new Color(253,227,167));
		//Display.setBackground(new Color(162,222,208));
		
		
		//Main PAGE		
		heading = new JLabel("Shutterbugs");
		heading.setFont(new Font("Courier New" , Font.BOLD , 70));
		heading.setBounds(260,100,1000,90);
		heading.setForeground(new Color(147,242,20));
		Main.add(heading);
		
		heading = new JLabel("Official Photography Club of Kjsce");
		heading.setFont(new Font("Courier New" , Font.PLAIN		, 30));
		heading.setBounds(120,185,1000,90);
		heading.setForeground(new Color(147,242,20));
		Main.add(heading);
		
		inButton = new JButton("IN");
		inButton.setBounds(450 , 300 , 120 , 50);
		inButton.setEnabled(true);
		inButton.setOpaque(true);
		inButton.setBorderPainted(false);
		inButton.setBackground(new Color(4,159,168));
		inButton.setForeground(Color.white);
		inButton.addActionListener(this);
		Main.add(inButton);
		
		outButton = new JButton("OUT");
		outButton.setBounds(450 , 400 , 120 , 50);
		outButton.setEnabled(true);
		outButton.setOpaque(true);
		outButton.setBorderPainted(false);
		outButton.setBackground(new Color(4,159,168));
		outButton.setForeground(Color.white);
		outButton.addActionListener(this);
		Main.add(outButton);
		
		searchButton = new JButton("SEARCH");
		searchButton.setBounds(450 , 500 , 120 , 50);
		searchButton.setEnabled(true);	
		searchButton.setOpaque(true);
		searchButton.setBorderPainted(false);	
		searchButton.setBackground(new Color(4,159,168));
		searchButton.setForeground(Color.white);	
		searchButton.addActionListener(this);	
		Main.add(searchButton);
				
		displayButton = new JButton("DISPLAY");
		displayButton .setBounds(450 , 600 , 120 , 50);
		displayButton .setEnabled(true);	
		displayButton .setOpaque(true);
		displayButton .setBorderPainted(false);	
		displayButton .setBackground(new Color(4,159,168));
		displayButton .setForeground(Color.white);		
		displayButton .addActionListener(this);	
		Main.add(displayButton);
		
		developedBy = new JLabel("Developed by: Mihir Gandhi");
		developedBy.setFont(new Font("Courier New" , Font.PLAIN , 30));
		developedBy.setBounds(260,700,1000,90);
		developedBy.setForeground(new Color(147,242,20));
		Main.add(developedBy);
		
		BufferedImage image=null;
		File f=null;
		img=new JLabel();
		img.setPreferredSize(new Dimension(80,80));
		img.setBounds(780 , 60, 200 , 200);
		Main.add(img);
		try
		{
			f=new File("logo.png");
			image=ImageIO.read(f);
			Image i=image.getScaledInstance(150,150,BufferedImage.SCALE_FAST);
			img.setIcon(new ImageIcon(i));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		cards.add(Main);
		
		
		//Out PAGE		
		heading2 = new JLabel("OUT");
		heading2.setFont(new Font("Courier New" , Font.BOLD , 60));
		heading2.setBounds(400 , 40, 400 , 50);
		Out.add(heading2);
		
		namel = new JLabel("Name: ");
		namel.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		namel.setBounds(150  , 100 ,  200 , 30);
		Out.add(namel);
		
		namet=new JTextField(50);
		namet.setBounds(250  , 100 ,  200 , 30);
		namet.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(namet);
		
		cameral = new JLabel("Body: ");
		cameral.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		cameral.setBounds(150  , 160 ,  200 , 30);
		Out.add(cameral);
		
		camerat=new JTextField(50);
		camerat.setBounds(250  , 160 ,  200 , 30);
		camerat.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(camerat);
		
		lensl = new JLabel("Lens: ");
		lensl.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		lensl.setBounds(150  , 220 ,  200 , 30);
		Out.add(lensl);
		
		lenst=new JTextField(50);
		lenst.setBounds(250  , 220 ,  200 , 30);
		lenst.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(lenst);
		
		tripodl = new JLabel("Tripod: ");
		tripodl.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		tripodl.setBounds(150  , 280 ,  200 , 30);
		Out.add(tripodl);
		
		tripodt=new JTextField(50);
		tripodt.setBounds(250  , 280 ,  200 , 30);
		tripodt.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(tripodt);
		
		cardl = new JLabel("Card: ");
		cardl.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		cardl.setBounds(150  , 340 ,  200 , 30);
		Out.add(cardl);
		
		cardt=new JTextField(50);
		cardt.setBounds(250  , 340 ,  200 , 30);
		cardt.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(cardt);
		
		eventl = new JLabel("Event: ");
		eventl.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		eventl.setBounds(150  , 400 ,  200 , 30);
		Out.add(eventl);
		
		eventt= new JTextField(50);
		eventt.setBounds(250  , 400 ,  200 , 30);
		eventt.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		Out.add(eventt);
		
		added = new JTextField();
		added.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		added.setBounds(50  , 540 ,  900 , 30);
		Out.add(added);
		
		addButton = new JButton("ADD");
		addButton .setBounds(200 , 470 , 90 , 50);
		addButton .setEnabled(true);		
		addButton .setOpaque(true);
		addButton .setBorderPainted(false);	
		addButton .setBackground(new Color(4,159,168));
		addButton .setForeground(Color.white);		
		addButton .addActionListener(this);	
		Out.add(addButton);
	
		back2= new JButton("Back");
		back2 .setBounds(50 , 600 , 90 , 50); 
		back2 .setEnabled(true);
		back2. setOpaque(true);
		back2 .setBorderPainted(false);			
		back2 .setBackground(new Color(4,159,168));
		back2 .setForeground(Color.white);		
		back2 .addActionListener(this);	
		Out.add(back2);
		
		BufferedImage image3=null;
		File f3=null;
		img3=new JLabel();
		img3.setPreferredSize(new Dimension(80,80));
		img3.setBounds(780 , 40, 200 , 200);
		Out.add(img3);
		try
		{
			f3=new File("logo.png");
			image3=ImageIO.read(f);
			Image i=image.getScaledInstance(150,150,BufferedImage.SCALE_FAST);
			img3.setIcon(new ImageIcon(i));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
										
		cards.add(Out);		
		
		
		//IN PAGE
		
		heading3 = new JLabel("IN");
		heading3.setFont(new Font("SansSerif" , Font.BOLD, 60));
		heading3.setBounds(400 , 60, 400 , 40); ////////
		In.add(heading3);
		
		namel2 = new JLabel("Enter Name: ");
		namel2.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		namel2.setBounds(150  , 220 ,  200 , 30);
		In.add(namel2);
		
		namet2=new JTextField(50);
		namet2.setBounds(330  , 220 ,  150 , 30);
		namet2.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		In.add(namet2);
		
		commentl = new JLabel("Comment: ");
		commentl.setFont(new Font("SansSerif" , Font.PLAIN , 30));
		commentl.setBounds(150  , 300 ,  500 , 30);
		In.add(commentl);
		
		commentt=new JTextField(50);
		commentt.setBounds(300  , 300 ,  500 , 30);
		commentt.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		In.add(commentt);
	
		returned = new JTextField();
		returned.setFont(new Font("SansSerif" , Font.PLAIN , 20));
		returned.setBounds(50  , 500 ,  900 , 30);
		In.add(returned);
		
		returnedButton = new JButton("RETURNED");
		returnedButton .setBounds(200 , 400, 150 , 50);
		returnedButton .setEnabled(true);		
		returnedButton .setOpaque(true);
		returnedButton .setBorderPainted(false);	
		returnedButton .setBackground(new Color(4,159,168));
		returnedButton .setForeground(Color.white);		
		returnedButton .addActionListener(this);	
		In.add(returnedButton);
		
		back= new JButton("Back");
		back .setBounds(50 , 600 , 90 , 50); ////
		back .setEnabled(true);	
		back .setOpaque(true);
		back .setBorderPainted(false);	
		back .setBackground(new Color(4,159,168));
		back .setForeground(Color.white);		
		back .addActionListener(this);	
		In.add(back);
		
        BufferedImage image2=null;
		File f2=null;
		img2=new JLabel();
		img2.setPreferredSize(new Dimension(180,180));
		img2.setBounds(780 , 20, 180 , 180);
		In.add(img2);
		try
		{
			f2=new File("logo.png");
			image=ImageIO.read(f);
			Image i=image.getScaledInstance(150,150,BufferedImage.SCALE_FAST);
			img2.setIcon(new ImageIcon(i));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		cards.add(In);		
		
		//Search PAGE
		
		heading4 = new JLabel("SEARCH");
		heading4.setFont(new Font("SansSerif" , Font.BOLD , 50)); ///////
		heading4.setBounds(400 , 30, 400 , 40);//////
		Search.add(heading4);
		
		namel3 = new JLabel("Search by name: ");
		namel3.setFont(new Font("Helvetica" , Font.PLAIN , 30));
		namel3.setBounds(150  , 120 ,  500 , 30);
		Search.add(namel3);
		
		sbyname=new JTextField(50);
		sbyname.setBounds(400  , 120 ,  200 , 30);
		sbyname.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Search.add(sbyname);
		
		cameral3 = new JLabel("Search by camera: ");
		cameral3.setFont(new Font("Helvetica" , Font.PLAIN , 30));
		cameral3.setBounds(150  , 280 ,  500 , 30);
		Search.add(cameral3);
		
		sbycam=new JTextField(50);
		sbycam.setBounds(420  , 280,  200 , 30);
		sbycam.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Search.add(sbycam);

		lensl3 = new JLabel("Search by lens: ");
		lensl3.setFont(new Font("Helvetica" , Font.PLAIN , 30));
		lensl3.setBounds(150  , 360 ,  500 , 30);
		Search.add(lensl3);
		
		sbylens=new JTextField(50);
		sbylens.setBounds(400  , 360 ,  200 , 30);
		sbylens.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Search.add(sbylens);
		
		eventl2 = new JLabel("Search by event: ");
		eventl2.setFont(new Font("Helvetica" , Font.PLAIN , 30));
		eventl2.setBounds(150  , 200 ,  500 , 30);
		Search.add(eventl2);
		
		sbyevent=new JTextField(50);
		sbyevent.setBounds(400  , 200 ,  200 , 30);
		sbyevent.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Search.add(sbyevent);
		
		search= new JButton("Search");
		search .setBounds(200 , 430 , 100 , 50);
		search .setEnabled(true);	
		search .setOpaque(true);
		search .setBorderPainted(false);		
		search .setBackground(new Color(4,159,168));
		search .setForeground(Color.white);		
		search .addActionListener(this);	
		Search.add(search);
		
		back4= new JButton("Back");
		back4 .setBounds(50 , 600 , 90 , 50);
		back4 .setEnabled(true);
		back4 .setOpaque(true);
		back4 .setBorderPainted(false);				
		back4 .setBackground(new Color(4,159,168));
		back4 .setForeground(Color.white);		
		back4 .addActionListener(this);	
		Search.add(back4);
		
		result = new JTextField();
		result.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		result.setBounds(50  , 530 ,  900 , 30);
		Search.add(result);
		
		BufferedImage image4=null;
		File f4=null;
		img4=new JLabel();
		img4.setPreferredSize(new Dimension(80,80));
		img4.setBounds(780 , 40, 200 , 200);
		Search.add(img4);
		try
		{
			f3=new File("logo.png");
			image4=ImageIO.read(f);
			Image i=image.getScaledInstance(150,150,BufferedImage.SCALE_FAST);
			img4.setIcon(new ImageIcon(i));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		cards.add(Search);
		
		//Display PAGE
		
		/*heading5 = new JLabel("DISPLAY");
		heading5.setFont(new Font("Helvetica" , Font.PLAIN , 30));
		heading5.setBounds(400 , 20, 400 , 40);
		Display.add(heading5);
	
		table=new JTextField();
		table.setBounds(50 , 120 ,  700 , 30);
		table.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Display.add(table);
		
		table2=new JTextField();
		table2.setBounds(50 , 200 ,  700 , 30);
		table2.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Display.add(table2);
		
		table3=new JTextField();
		table3.setBounds(50 , 300 ,  700 , 30);
		table3.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Display.add(table3);
		
		table4=new JTextField();
		table4.setBounds(50 , 400 ,  700 , 30);
		table4.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Display.add(table4);
		
		table5=new JTextField();
		table5.setBounds(50 , 500 ,  700 , 30);
		table5.setFont(new Font("Helvetica" , Font.PLAIN , 20));
		Display.add(table5);
		
		back3= new JButton("Back");
		back3 .setBounds(50 , 600 , 90 , 50);
		back3 .setEnabled(true);		
		back3 .setBackground(new Color(4,159,168));
		back3 .setForeground(Color.white);		
		back3 .addActionListener(this);	
		Display.add(back3);
						
		cards.add(Display);	*/
		
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)		//HOW WILL NEXT AND PREVIOUS BE DECIDED
	{
		if(ae.getSource()==inButton)
		{
			c.next(cards);
			c.next(cards);
			namet2.setText("");
			commentt.setText("");
		}
		else if(ae.getSource()==outButton)
		{
			c.next(cards);
			namet.setText("");
			camerat.setText("");
			lenst.setText("");
			cardt.setText("");
			eventt.setText("");
			tripodt.setText("");
		}
		else if(ae.getSource()==searchButton)
		{
			c.next(cards);
			c.next(cards);
			c.next(cards);
			sbyname.setText("");
			sbylens.setText("");
			sbycam.setText("");
			sbyevent.setText("");
		}
		else if(ae.getSource()==displayButton)
		{
			//System.out.println(" ");
			//System.out.println("Id:"+e.getId()+"\tName:"+ e.getName() + "\tCamera:"+e.getCamera() + "\tLens:"+e.getLens() + "\tTripod:"+e.getTripod() + "\tCard:"+e.getCard() +"\tEvent:"+ e.getEvent()+ "\tStatus:"+ e.getStatus()+ "\tComment:"+ e.getComment());
			String fileName = "Record.txt";
			
			try {

				FileWriter fileWriter = new FileWriter(fileName);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
				for(int j=0; j<v2.size(); j++)
				{
					Entry e=(Entry)v2.get(j);
					bufferedWriter.write("Id:"+e.getId()+"\t\tName:"+ e.getName() + "\t\tCamera:"+e.getCamera() + "\t\tLens:"+e.getLens() + "\t\tTripod:"+e.getTripod() + "\t\tCard:"+e.getCard() +"\t\tEvent:"+ e.getEvent()+ "\t\tStatus:"+ e.getStatus()+ "\t\tComment:"+ e.getComment());
					bufferedWriter.newLine();
				}
				
				/* bufferedWriter.write("Id:\t\tName\t\tCamera\t\tLens\t\tTripod\t\tCard\t\tEvent\t\tStatus\t\tComment");
				
				for(int j=0; j<v2.size(); j++)
				{
					Entry e=(Entry)v2.get(j);
					bufferedWriter.write(e.getId()+"\t\t"+ e.getName() + "\t\t"+e.getCamera() + "\t\t"+e.getLens() + "\t\t"+e.getTripod() + "\t\t"+e.getCard() +"\t\t"+ e.getEvent()+ "\t\t"+ e.getStatus()+ "\t\t"+ e.getComment());
					bufferedWriter.newLine();
				} */
				
				bufferedWriter.close();
			}
			catch(IOException ex) {
				System.out.println("Error writing to file '"+ fileName + "'");
			}	
		}
		/*else if(ae.getSource()==cont)
		{
			c.next(cards);
		}*/
		else if(ae.getSource()==back)			//////////////////
		{			
			c.previous(cards);
			c.previous(cards);
			returned.setText("");
		}
		else if(ae.getSource()==back2)				////////////////////////
		{			
			c.previous(cards);
			added.setText("");
		}
		/*else if(ae.getSource()==back3)			////////////////////
		{			
			c.previous(cards);
			c.previous(cards);
			c.previous(cards);
			c.previous(cards);
		}*/
		else if(ae.getSource()==back4)			////////////////////
		{			
			c.previous(cards);
			c.previous(cards);
			c.previous(cards);
			result.setText("");
		}
		else if(ae.getSource()==addButton)
		{
			Entry e=new Entry();
			int i=v2.size();
			String n=namet.getText();
			String c=camerat.getText();
			String l=lenst.getText();
			String t=tripodt.getText();
			String ca=cardt.getText();
			String event=eventt.getText();
			e.setName(n);  
			e.setCamera(c);
			e.setLens(l);
			e.setTripod(t);
			e.setCard(ca);
			e.setId(i);
			e.setEvent(event);
			e.setStatus("On Field");
			e.setComment("---");
			v.addElement(e);
			v2.addElement(e);
	        added.setText("ADDED-> Id:"+e.getId()+"  Name:"+ e.getName() + "  Camera:"+e.getCamera() + "  Lens:"+e.getLens() + "  Tripod:"+e.getTripod() + "  Card:"+e.getCard()+"  Event:"+ e.getEvent());
			//table.setText("Name: "+ e.getName() + "  Camera: "+e.getCamera() + "  Lens: "+e.getLens() + "  Tripod: "+e.getTripod() + "  Card: "+e.getCard() );
			namet.setText("");
			camerat.setText("");
			lenst.setText("");
			tripodt.setText("");
			cardt.setText("");
			eventt.setText("");		}
		/*else if(ae.getSource()==returnedButton)
		{
			int index=Integer.parseInt(namet2.getText());
			int k=0;
			while(k!=index)
			{
				k++; 
			}
			Entry f=(Entry)v.get(k);
	        returned.setText("RETURNED: Name: "+ f.getName() + "  Camera: "+f.getCamera() + "  Lens: "+f.getLens() + "  Tripod: "+f.getTripod() + "  Card: "+f.getCard() );
			v.remove(k);
			namet2.setText("");
			camerat2.setText("");
		}*/
		else if(ae.getSource()==search)
		{
			result.setText("");
			String str2=sbyname.getText();
			String str3=sbycam.getText();
			String str4=sbylens.getText();
			String str5=sbyevent.getText();
			for(int j=0;j<v.size();j++)
			{
				Entry f=(Entry)v.get(j);
				if(f.getName().equalsIgnoreCase(str2)||f.getCamera().equalsIgnoreCase(str3)||f.getLens().equalsIgnoreCase(str4)||f.getEvent().equalsIgnoreCase(str5))
				{
					result.setText("Name: "+ f.getName() + "  Camera: "+f.getCamera() + "  Lens: "+f.getLens() + "  Tripod: "+f.getTripod() + "  Card: "+f.getCard() +"  Event:"+ f.getEvent()+"  Status:"+ f.getStatus()+ "  Comment:"+f.getComment());
					break;
				}
				else
				{
					result.setText("Available");
				}
			}
			sbyname.setText("");
			sbycam.setText("");
			sbylens.setText("");			//Entry f=(Entry)v.get(k);
	       // result.setText("Name: "+ f.getName() + "  Camera: "+f.getCamera() + "  Camera: "+f.getLens() + "  Camera: "+f.getTripod() + "  Camera: "+f.getCard() );
		}
		else if(ae.getSource()==returnedButton)
		{
		
				String nameinret=namet2.getText();
				int k=0;
				int flag=0;
				for(int j=0;j<v.size();j++)
				{
					Entry f=(Entry)v.get(j);
					if(f.getName().equalsIgnoreCase(nameinret))
					{
						k=j;
						flag=1;
					}
				}
				if(flag==1)
				{
					Entry f=(Entry)v.get(k);
					f.setStatus("Returned");
					f.setComment(commentt.getText());
					returned.setText("Name: "+ f.getName() + "  Camera: "+f.getCamera() + "  Camera: "+f.getLens() + "  Camera: "+f.getTripod() + "  Camera: "+f.getCard() +"  Event:"+ f.getEvent()+"  Status:"+ f.getStatus() + "  Comment:"+f.getComment() );
					namet2.setText("");
					commentt.setText("");
				}
				else
				{
					returned.setText("Bhai naam to sahi daal...");
					namet2.setText("");
					commentt.setText("");
				}
			
		}
		/*else if(ae.getSource()==done)
		{
			
		}*/
	}
	public static void main(String args[])
	{
		SB ob=new SB("Database");

	}
}

class Entry
{
	int id;
	String name; 
	String camera;
	String lens; 
	String tripod; 
	String card; 
	String event;
	String status;
	String comment;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{ 
		this.id=id;
	}
	public String getName() 
	{ 
		return name; 
	} 
	public void setName(String n)
	{ 
		this.name = n;
	} 
	public String getCamera() 
	{ 
		return camera; 
	} 
	public void setCamera(String c)
	{ 
		this.camera = c;
	} 
	public String getLens() 
	{ 
		return lens; 
	} 
	public void setLens(String l)
	{ 
		this.lens = l;
	} 
	public String getTripod() 
	{ 
		return tripod; 
	} 
	public void setTripod(String t)
	{ 
		this.tripod = t;
	} 
	public String getCard() 
	{ 
		return card; 
	} 
	public void setCard(String ca)
	{ 
		this.card = ca;
	} 
	public String getEvent() 
	{ 
		return event; 
	} 
	public void setEvent(String event)
	{ 
		this.event = event;
	} 
	public String getStatus() 
	{ 
		return status; 
	} 
	public void setStatus(String status)
	{ 
		this.status = status;
	} 
	public String getComment() 
	{ 
		return comment; 
	} 
	public void setComment(String comment)
	{ 
		this.comment = comment;
	} 
}




