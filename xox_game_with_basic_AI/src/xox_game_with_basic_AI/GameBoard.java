package xox_game_with_basic_AI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameBoard {
	private static GameBoard board;
	
	private GameBoard() {}
	
	public static GameBoard GetBoard() {
		if(board == null){
			synchronized (GameBoard.class) {
				if(board == null) {
					board = new GameBoard();
				}
			}
		}
		return board;
	}
	public static boolean GameEnder = false;
	//this singleton pattern stands for creatig object only one time
	
	//9 frame for 9 square 1 holder for holding all
	private JFrame frame;
	private JPanel holder;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	private ArrayList<String> selecteds = new ArrayList<String>();
	
	public void GameBoardInside() {
		frame = new JFrame("xox with AI");
		
		
		
		holder = new JPanel();
		holder.setLayout(new GridLayout(3,3));
		
		button1 = new JButton();
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button1.getText().equalsIgnoreCase("O") || button1.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button1.setText("X");
					setClicked("11");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button2 = new JButton();
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button2.getText().equalsIgnoreCase("O") || button2.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button2.setText("X");
					setClicked("12");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button3 = new JButton();
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button3.getText().equalsIgnoreCase("O") || button3.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button3.setText("X");
					setClicked("13");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button4 = new JButton();
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button4.getText().equalsIgnoreCase("O") || button4.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button4.setText("X");
					setClicked("21");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button5 = new JButton();
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button5.getText().equalsIgnoreCase("O") || button5.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button5.setText("X");
					setClicked("22");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button6 = new JButton();
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button6.getText().equalsIgnoreCase("O") || button6.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button6.setText("X");
					setClicked("23");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button7 = new JButton();
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button7.getText().equalsIgnoreCase("O") || button7.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button7.setText("X");
					setClicked("31");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button8 = new JButton();
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button8.getText().equalsIgnoreCase("O") || button8.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
				}else {
					button8.setText("X");
					setClicked("32");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		button9 = new JButton();
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(button9.getText().equalsIgnoreCase("O") || button9.getText().equalsIgnoreCase("X")) {
					JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
					
				}else {
					button9.setText("X");
					setClicked("33");
					ifGameOver();
					AI();
					ifGameOver();
				}
			}
		});
		holder.add(button1);
		holder.add(button2);
		holder.add(button3);
		holder.add(button4);
		holder.add(button5);
		holder.add(button6);
		holder.add(button7);
		holder.add(button8);
		holder.add(button9);//set clicked is clicked
		
		frame.setSize(500, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(holder);
	}
	
	public boolean ifGameOver() {
		String a = button1.getText();
		String b = button2.getText();
		String c = button3.getText();
		
		String d = button4.getText();
		String e = button5.getText();
		String f = button6.getText();
		
		String g = button7.getText();
		String h = button8.getText();
		String z = button9.getText();
		
		if((a.equalsIgnoreCase(e)&&e.equalsIgnoreCase(z)) && (a.equalsIgnoreCase("X") || a.equalsIgnoreCase("O"))) {//across game ower control////////////////////////////
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + a);
			return true;
		}else if((c.equalsIgnoreCase(e)&&e.equalsIgnoreCase(g))  && (c.equalsIgnoreCase("X") || c.equalsIgnoreCase("O"))) {
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + d);
			return true;
		}else if((a.equalsIgnoreCase(b)&&b.equalsIgnoreCase(c)) && (a.equalsIgnoreCase("X") || a.equalsIgnoreCase("O"))) {//horizontal game ower control
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + a);
			return true;
		}else if((d.equalsIgnoreCase(e)&&e.equalsIgnoreCase(f)) && (d.equalsIgnoreCase("X") || d.equalsIgnoreCase("O"))) {
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + d);//JOptionPane.showMessageDialog(null, "that target is not valied for that kind of action", "ERROR",JOptionPane.ERROR_MESSAGE);
			return true;
		} else if((g.equalsIgnoreCase(h)&&h.equalsIgnoreCase(z)) && (g.equalsIgnoreCase("X") || g.equalsIgnoreCase("O"))) {
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + g);
			return true;
		}else if((a.equalsIgnoreCase(d)&&d.equalsIgnoreCase(g)) && (a.equalsIgnoreCase("X") || a.equalsIgnoreCase("O"))) {//vertical game ower control
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + a);
			return true;
		}else if((b.equalsIgnoreCase(e)&&e.equalsIgnoreCase(h))  && (b.equalsIgnoreCase("X") || b.equalsIgnoreCase("O"))){
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + h);
			return true;
		} else if((c.equalsIgnoreCase(f)&&f.equalsIgnoreCase(z))  && (c.equalsIgnoreCase("X") || c.equalsIgnoreCase("O"))){
			JOptionPane.showMessageDialog(null,"game ower the winner IS : " + z);
			return true;
		}else {
			return false;
		}
	}
	
	public void AI() {
		String a = button1.getText();
		String b = button2.getText();
		String c = button3.getText();
		
		String d = button4.getText();
		String e = button5.getText();
		String f = button6.getText();
		
		String g = button7.getText();
		String h = button8.getText();
		String z = button9.getText();
		
		boolean control_win_statement_first = false;
		
		
		if(!control_win_statement_first) {
			control_win_statement_first = true;
										// horizantal contol point //
			if(!e.equalsIgnoreCase("X") && !e.equalsIgnoreCase("O")) {
				button5.setText("O");
				return;
			}else if(b.equalsIgnoreCase(c) &&  a.equalsIgnoreCase("") && (c.equalsIgnoreCase("O"))) {//a doldu // yatay
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(c) && b.equalsIgnoreCase("") && (c.equalsIgnoreCase("O"))) {//b doldu // yatay
				button2.setText("O");
				return;
			}else if(a.equalsIgnoreCase(b) && c.equalsIgnoreCase("") && (a.equalsIgnoreCase("O"))){//c doldu // yatay
				button3.setText("O");
				return;
			}else if(e.equalsIgnoreCase(f) && d.equalsIgnoreCase("") && (e.equalsIgnoreCase("O"))) {//d doldu // yatay
				button4.setText("O");
				return;
			}else if(d.equalsIgnoreCase(f) && e.equalsIgnoreCase("") && (d.equalsIgnoreCase("O"))) {//e doldu // yatay
				button5.setText("O");
				return;
			}else if(d.equalsIgnoreCase(e) && f.equalsIgnoreCase("") && (d.equalsIgnoreCase("O"))) {//f doldu // yatay
				button6.setText("O");
				return;
			}else if(h.equalsIgnoreCase(z) && g.equalsIgnoreCase("") && (h.equalsIgnoreCase("O"))) {//g doldu // yatay
				button7.setText("O");
				return;
			}else if(g.equalsIgnoreCase(z) && h.equalsIgnoreCase("") && (g.equalsIgnoreCase("O"))) {//h doldu // yatay
				button8.setText("O");
				return;
			}else if(g.equalsIgnoreCase(h) && z.equalsIgnoreCase("") && (g.equalsIgnoreCase("O"))) {//z doldu // yatay
				button9.setText("O");
				return;
			}					// horizantal contol is over  //
						//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
					
							// vertical control point //
						
				///adg			///beh			///cfz
			else if(d.equalsIgnoreCase(g) &&  a.equalsIgnoreCase("")&& (d.equalsIgnoreCase("O")) ) {//a doldu // dickey
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(g) && d.equalsIgnoreCase("") && (a.equalsIgnoreCase("O"))) {//b doldu // dickey
				button4.setText("O");
				return;
			}else if(d.equalsIgnoreCase(a) && g.equalsIgnoreCase("") && (a.equalsIgnoreCase("O"))){//c doldu // dickey		//3
				button7.setText("O");
				return;
			}else if(e.equalsIgnoreCase(h) && b.equalsIgnoreCase("") && (e.equalsIgnoreCase("O"))) {//d doldu // dickey
				button2.setText("O");
				return;
			}else if(b.equalsIgnoreCase(h) && e.equalsIgnoreCase("") && (b.equalsIgnoreCase("O"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(b.equalsIgnoreCase(e) && h.equalsIgnoreCase("") && (b.equalsIgnoreCase("O"))) {//f doldu // dickey		//3
				button8.setText("O");
				return;
			}else if(f.equalsIgnoreCase(z) && c.equalsIgnoreCase("") && (f.equalsIgnoreCase("O"))) {//g doldu // dickey
				button3.setText("O");
				return;
			}else if(c.equalsIgnoreCase(z) && f.equalsIgnoreCase("") && (c.equalsIgnoreCase("O"))) {//h doldu // dickey
				button6.setText("O");
				return;
			}else if(c.equalsIgnoreCase(f) && z.equalsIgnoreCase("") && (c.equalsIgnoreCase("O"))) {//z doldu // dickey		//3
				button9.setText("O");
				return;
			}
							// 	vertical conrol is ower //
				//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
							// 	across control point	//
			//	aez	ceg
			
			else if(z.equalsIgnoreCase(e) &&  a.equalsIgnoreCase("")&& (z.equalsIgnoreCase("O")) ) {//a doldu // dickey
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(z) && e.equalsIgnoreCase("") && (a.equalsIgnoreCase("O"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(e.equalsIgnoreCase(a) && g.equalsIgnoreCase("") && (e.equalsIgnoreCase("O"))){//z doldu // dickey		//3
				button9.setText("O");
				return;
			}else if(g.equalsIgnoreCase(e) &&  c.equalsIgnoreCase("")&& (e.equalsIgnoreCase("O")) ) {//a doldu // dickey
				button3.setText("O");
				return;
			}else if(c.equalsIgnoreCase(g) && e.equalsIgnoreCase("") && (g.equalsIgnoreCase("O"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(c.equalsIgnoreCase(e) && g.equalsIgnoreCase("") && (c.equalsIgnoreCase("O"))){//z doldu // dickey		//3
				button7.setText("O");
				return;
			}
			
								// across control is over
					//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
		} if (control_win_statement_first) {
								// controlled situation (if its win situation)
								// now controlling (if its lose situation)
								//*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
			
			
			
			
			if(b.equalsIgnoreCase(c) &&  a.equalsIgnoreCase("") && (c.equalsIgnoreCase("X"))) {//a doldu // yatay
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(c) && b.equalsIgnoreCase("") && (c.equalsIgnoreCase("X"))) {//b doldu // yatay
				button2.setText("O");
				return;
			}else if(a.equalsIgnoreCase(b) && c.equalsIgnoreCase("") && (a.equalsIgnoreCase("X"))){//c doldu // yatay
				button3.setText("O");
				return;
			}else if(e.equalsIgnoreCase(f) && d.equalsIgnoreCase("") && (e.equalsIgnoreCase("X"))) {//d doldu // yatay
				button4.setText("O");
				return;
			}else if(d.equalsIgnoreCase(f) && e.equalsIgnoreCase("") && (d.equalsIgnoreCase("X"))) {//e doldu // yatay
				button5.setText("O");
				return;
			}else if(d.equalsIgnoreCase(e) && f.equalsIgnoreCase("") && (d.equalsIgnoreCase("X"))) {//f doldu // yatay
				button6.setText("O");
				return;
			}else if(h.equalsIgnoreCase(z) && g.equalsIgnoreCase("") && (h.equalsIgnoreCase("X"))) {//g doldu // yatay
				button7.setText("O");
				return;
			}else if(g.equalsIgnoreCase(z) && h.equalsIgnoreCase("") && (g.equalsIgnoreCase("X"))) {//h doldu // yatay
				button8.setText("O");
				return;
			}else if(g.equalsIgnoreCase(h) && z.equalsIgnoreCase("") && (g.equalsIgnoreCase("X"))) {//z doldu // yatay
				button9.setText("O");
				return;
			}					// horizantal contol is over  //
						//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
					
							// vertical control point //
						
				///adg			///beh			///cfz
			else if(d.equalsIgnoreCase(g) &&  a.equalsIgnoreCase("")&& (d.equalsIgnoreCase("X")) ) {//a doldu // dickey
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(g) && d.equalsIgnoreCase("") && (a.equalsIgnoreCase("X"))) {//b doldu // dickey
				button4.setText("O");
				return;
			}else if(d.equalsIgnoreCase(a) && g.equalsIgnoreCase("") && (a.equalsIgnoreCase("X"))){//c doldu // dickey		//3
				button7.setText("O");
				return;
			}else if(e.equalsIgnoreCase(h) && b.equalsIgnoreCase("") && (e.equalsIgnoreCase("X"))) {//d doldu // dickey
				button2.setText("O");
				return;
			}else if(b.equalsIgnoreCase(h) && e.equalsIgnoreCase("") && (b.equalsIgnoreCase("X"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(b.equalsIgnoreCase(e) && h.equalsIgnoreCase("") && (b.equalsIgnoreCase("X"))) {//f doldu // dickey		//3
				button8.setText("O");
				return;
			}else if(f.equalsIgnoreCase(z) && c.equalsIgnoreCase("") && (f.equalsIgnoreCase("X"))) {//g doldu // dickey
				button3.setText("O");
				return;
			}else if(c.equalsIgnoreCase(z) && f.equalsIgnoreCase("") && (c.equalsIgnoreCase("X"))) {//h doldu // dickey
				button6.setText("O");
				return;
			}else if(c.equalsIgnoreCase(f) && z.equalsIgnoreCase("") && (c.equalsIgnoreCase("X"))) {//z doldu // dickey		//3
				button9.setText("O");
				return;
			}
							// 	vertical conrol is ower //
				//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
							// 	across control point	//
			//	aez	ceg
			
			else if(z.equalsIgnoreCase(e) &&  a.equalsIgnoreCase("")&& (z.equalsIgnoreCase("X")) ) {//a doldu // dickey
				button1.setText("O");
				return;
			}else if(a.equalsIgnoreCase(z) && e.equalsIgnoreCase("") && (a.equalsIgnoreCase("X"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(e.equalsIgnoreCase(a) && g.equalsIgnoreCase("") && (e.equalsIgnoreCase("X"))){//z doldu // dickey		//3
				button9.setText("O");
				return;
			}else if(g.equalsIgnoreCase(e) &&  c.equalsIgnoreCase("")&& (e.equalsIgnoreCase("X")) ) {//a doldu // dickey
				button3.setText("O");
				return;
			}else if(c.equalsIgnoreCase(g) && e.equalsIgnoreCase("") && (g.equalsIgnoreCase("X"))) {//e doldu // dickey
				button5.setText("O");
				return;
			}else if(c.equalsIgnoreCase(e) && g.equalsIgnoreCase("") && (c.equalsIgnoreCase("X"))){//z doldu // dickey		//3
				button7.setText("O");
				return;
			}
								//situation of if lose is over
								//*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
			
			//18 38 76 16 34 94 72 92 L trap that i dont involved for this version of game
			
			
			else if((a.equalsIgnoreCase("X") && z.equalsIgnoreCase("X"))||(c.equalsIgnoreCase("X") && g.equalsIgnoreCase("X"))) {//1-9 and 3-7 must controlled for strategic playz 2468
				if(b.equalsIgnoreCase("")) {//2
					button2.setText("O");
				}else if(d.equalsIgnoreCase("")) {//4
					button4.setText("O");
				}else if(f.equalsIgnoreCase("")) {//6
					button6.setText("O");
				}else if(h.equalsIgnoreCase("")) {//8
					button8.setText("O");
				}
				return;
			}
			
			
			
			
			//////there is is 1874 trap 
			//tuzaðýda kursun
			
			//rakip ortaya gelince köþeye diðer köþe kapýlýnca kapýlmamýþ diyagoneldeki köþeye zýplýcak
			else if(e.equalsIgnoreCase("X")) {
				if(a.equalsIgnoreCase("")) {
					button1.setText("O");
				}else if(c.equalsIgnoreCase("")) {
					button3.setText("O");
				}else if(g.equalsIgnoreCase("")) {
					button7.setText("O");
				}else if(z.equalsIgnoreCase("")) {
					button9.setText("O");
				}
				return;
			}
			
			else{//if all of conditions are failed (which is pretty much not possible)
				
				boolean finded_empty_space = false;
				while(!finded_empty_space) {
					
					if(!a.equalsIgnoreCase("") && !b.equalsIgnoreCase("") && !c.equalsIgnoreCase("") && !d.equalsIgnoreCase("") && !e.equalsIgnoreCase("") && !f.equalsIgnoreCase("") && !g.equalsIgnoreCase("") && !h.equalsIgnoreCase("") && !z.equalsIgnoreCase("")) {
						System.err.println("THERE IS NO WALIED");
						finded_empty_space = true;
					}
					
					int candidate_empty_space = randomNumberGenereter();
					
					switch (candidate_empty_space) {///abcdefghz
					
					case 1:
						
						if(a.equalsIgnoreCase("")) {
							button1.setText("O");
							finded_empty_space = true;
						}
						
						break;
					case 2:
						
						if(b.equalsIgnoreCase("")) {
							button2.setText("O");
							finded_empty_space = true;
						}
						
						
						break;
					case 3:
						
						if(c.equalsIgnoreCase("")) {
							button3.setText("O");
							finded_empty_space = true;
						}
						
						break;
					case 4:
						
						if(d.equalsIgnoreCase("")) {
							button4.setText("O");
							finded_empty_space = true;
						}
						
						break;
						
					case 5:
						
						if(e.equalsIgnoreCase("")) {
							button5.setText("O");
							finded_empty_space = true;
						}
						
						break;
					case 6:
						
						if(f.equalsIgnoreCase("")) {
							button6.setText("O");
							finded_empty_space = true;
						}
						
						break;
					case 7:
						
						if(g.equalsIgnoreCase("")) {
							button7.setText("O");
							finded_empty_space = true;
						}
						
						break;
						
					case 8:
						
						if(h.equalsIgnoreCase("")) {
							button8.setText("O");
							finded_empty_space = true;
						}
						
						break;
					case 9:
						
						if(z.equalsIgnoreCase("")) {
							button9.setText("O");
							finded_empty_space = true;
						}
						
						break;
						
					default:
						System.err.println("WHAT IS THAT FUCK IS NEEDS TO BE UNDER OR BELOW OF THIS SHIT" + candidate_empty_space);
						finded_empty_space = true;
						break;
					}
					
				}
				return;
			}
			
			
		}
	}		
	public Integer randomNumberGenereter() {
		
		Random r = new Random();
		
		return r.nextInt(9) + 1;
	}
	
	
	
	
	
	
	public String setClicked(String string) {
		selecteds.add(string);
		return string;
	}
	
	
	public static void main(String[] args) {
		GameBoard x = GameBoard.GetBoard();
		x.GameBoardInside();
	}
}