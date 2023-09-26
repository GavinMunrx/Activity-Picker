import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class activityPicker {	
    public static void main(String[] args) throws Exception {
    	activityPicker http = new activityPicker();  
        http.sendGet();}
						private void sendGet() throws Exception {
							System.out.println("Each 0.1 represented by the price is equivilant to $10, ie 0.2 = $20");
							System.out.println("Follow the prompts and have fun curing your boredom!");
							try (Scanner input1 = new Scanner(System.in)) {
								System.out.println("Hello there, are you in need of an activity?");
								String answer = input1.nextLine();
									while (answer.equalsIgnoreCase("yes")) {
										try (Scanner input2 = new Scanner(System.in)) {
											System.out.println("Out of the given categories, which activity type would you like? \n[\"educational\", \"recreational\", \"social\", \"diy\", \"music\", \"relaxation\", \"cooking\"]");
											String answer1 = input2.nextLine();
											if (answer1.equalsIgnoreCase("recreational")) {	
												try (Scanner input3 = new Scanner(System.in)) {
													System.out.println("Would you like the activity to be free?");
													String answer2 = input3.nextLine();
													if (answer2.equalsIgnoreCase("yes")) {
														try (Scanner input4 = new Scanner(System.in)) {
															System.out.println("Sorry! Not much to do with friends recreation wise. Press '1' to continue);");
															int answer3 = input4.nextInt();
															if (answer3 == 1) {									
																String url = "http://www.boredapi.com/api/activity?type=recreational&price=0&participants=1";
																URL obj = new URL(url);
																HttpURLConnection con = (HttpURLConnection) obj.openConnection();
																// optional default for this API is GET
																con.setRequestMethod("GET");
																BufferedReader in = new BufferedReader(
																		new InputStreamReader(con.getInputStream()));
																String inputLine;
																StringBuffer response = new StringBuffer();
																while ((inputLine = in.readLine()) != null) {
																		response.append(inputLine);																		}													
																//print result
																String message = "Creating a fun activity... \n";
																char[] chars = message.toCharArray();
																for (int i = 0; i < chars.length; i++)  {
																System.out.print(chars[i]);
																Thread.sleep(150); }
																System.out.println(response.toString());
																in.close();
																break;}								
														}
													}																							
													if (answer2.equalsIgnoreCase("no")) {
														try (Scanner input4 = new Scanner(System.in)) {
														System.out.println("Sorry! Not much to do with friends recreation wise. Press '1' to continue);");
														int answer3 = input4.nextInt();
														if (answer3 == 1) {									
															String url = "http://www.boredapi.com/api/activity?type=recreational&minprice=0.1&participants=1";
															URL obj = new URL(url);
															HttpURLConnection con = (HttpURLConnection) obj.openConnection();
															// optional default for this API is GET
															con.setRequestMethod("GET");
															BufferedReader in = new BufferedReader(
																	new InputStreamReader(con.getInputStream()));
															String inputLine;
															StringBuffer response = new StringBuffer();
															while ((inputLine = in.readLine()) != null) {
																response.append(inputLine);																		}													
															//print result
															String message = "Creating a fun activity... \n";
															char[] chars = message.toCharArray();
															for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
															System.out.println(response.toString());
															in.close();
															break;}										
														}
													}
												}		
											}								
									if (answer1.equalsIgnoreCase("educational")) {	
										try (Scanner input3 = new Scanner(System.in)) {
											System.out.println("Would you like the activity to be free?");
											String answer2 = input3.nextLine();
											if (answer2.equalsIgnoreCase("yes")) {
												try (Scanner input4 = new Scanner(System.in)) {
													System.out.println("Good on you for wanting to educate yourself, press '1' for some inspiration!?");
													int answer3 = input4.nextInt();
													if (answer3 == 1) {									
														String url = "http://www.boredapi.com/api/activity?type=education&price=0&participants=1";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
																response.append(inputLine);																		}													
														//print result
														String message = "Gathering Inspiration... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
																break;}												
												}
											}												
									
											if (answer2.equalsIgnoreCase("no")) {
												try (Scanner input4 = new Scanner(System.in)) {
												System.out.println("Good on you for wanting to educate yourself, press '1' for some inspiration!");
												int answer3 = input4.nextInt();
												if (answer3 == 1) {									
													String url = "http://www.boredapi.com/api/activity?type=education&minprice=0.1&participants=1";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Gathering Inspiration... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
													System.out.print(chars[i]);
													Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}												
												}
											}
										}
									}
									if (answer1.equalsIgnoreCase("diy")) {	
										try (Scanner input3 = new Scanner(System.in)) {
											System.out.println("Would you like the activity to be free?");
											String answer2 = input3.nextLine();
											if (answer2.equalsIgnoreCase("yes")) {
												try (Scanner input4 = new Scanner(System.in)) {
													System.out.println("Friends are overated anyways, stick with the name and Do It Yourself, press '1' to continue.");
													int answer3 = input4.nextInt();
													if (answer3 == 1) {									
														String url = "http://www.boredapi.com/api/activity?type=diy&price=0&participants=1";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
																response.append(inputLine);																		}													
														//print result
														String message = "Invisioning useful DIY's... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}											
												}
											}																					
											if (answer2.equalsIgnoreCase("no")) {
												try (Scanner input4 = new Scanner(System.in)) {
												System.out.println("Friends are overated anyways, stick with the name and Do It Yourself, press '1' to continue.");
												int answer3 = input4.nextInt();
												if (answer3 == 1) {									
													String url = "http://www.boredapi.com/api/activity?type=diy&minprice=0.1&participants=1";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Invisioning useful DIY's... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
													System.out.print(chars[i]);
													Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}							
												}
											}
										}
									}
									if (answer1.equalsIgnoreCase("social")) {	
										try (Scanner input3 = new Scanner(System.in)) {
											System.out.println("Would you like the activity to be free?");
											String answer2 = input3.nextLine();
											if (answer2.equalsIgnoreCase("yes")) {
												try (Scanner input4 = new Scanner(System.in)) {
													System.out.println("Remember, 3's a crowd! Pick a number of friends to hangout with between 1 and 5!");
													int answer3 = input4.nextInt();
													if (answer3 == 1) {									
														String url = "http://www.boredapi.com/api/activity?type=social&price=0&participants=1";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
																response.append(inputLine);																		}													
														//print result
														String message = "Searching for the ideal hangout spot... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
																break;}
													if (answer3 == 2) {									
														String url = "http://www.boredapi.com/api/activity?type=social&price=0&participants=2";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Searching for the ideal hangout spot... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
													if (answer3 == 3) {									
														String url = "http://www.boredapi.com/api/activity?type=social&price=0&participants=3";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Searching for the ideal hangout spot... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
													if (answer3 == 4) {									
														String url = "http://www.boredapi.com/api/activity?type=social&price=0&participants=4";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Searching for the ideal hangout spot... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
													if (answer3 == 5) {									
														String url = "http://www.boredapi.com/api/activity?type=social&price=0&participants=5";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Searching for the ideal hangout spot... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
												}
											}												
									
											if (answer2.equalsIgnoreCase("no")) {
												try (Scanner input4 = new Scanner(System.in)) {
												System.out.println("It's party time!! Pick a number of friends between 1 and 4 to have an awesome day with!");
												int answer3 = input4.nextInt();
												if (answer3 == 1) {									
													String url = "http://www.boredapi.com/api/activity?type=social&minprice=0.1&participants=1";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Downloading FUN... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
													System.out.print(chars[i]);
													Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												if (answer3 == 2) {									
													String url = "http://www.boredapi.com/api/activity?type=social&minprice=0.1&participants=2";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Downloading FUN... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												if (answer3 == 3) {									
													String url = "http://www.boredapi.com/api/activity?type=social&minprice=0.1&participants=3";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Downloading FUN... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												if (answer3 == 4) {									
													String url = "http://www.boredapi.com/api/activity?type=social&minprice=0.1&participants=4";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Downloading FUN... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												}
											}
							
										}
									}
									if (answer1.equalsIgnoreCase("cooking")) {	
										try (Scanner input3 = new Scanner(System.in)) {
											System.out.println("Unfortunately, there are no free options for cooking. Would you prefer a cheaper activity or a more expensive one?");
											String answer2 = input3.nextLine();
											if (answer2.equalsIgnoreCase("expensive")) {
												try (Scanner input4 = new Scanner(System.in)) {
													System.out.println("How many participants would you like (1-3)?");
													int answer3 = input4.nextInt();
													if (answer3 == 1) {									
														String url = "http://www.boredapi.com/api/activity?type=cooking&minprice=0.3&participants=1";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
																response.append(inputLine);																		}													
														//print result
														String message = "Locating Culinary Genius... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
																break;}
													if (answer3 == 2) {									
														String url = "http://www.boredapi.com/api/activity?type=cooking&minprice=0.3&participants=2";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Locating Culinary Genius... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
													if (answer3 == 3) {									
														String url = "http://www.boredapi.com/api/activity?type=cooking&minprice=0.3&participants=3";
														URL obj = new URL(url);
														HttpURLConnection con = (HttpURLConnection) obj.openConnection();
														// optional default for this API is GET
														con.setRequestMethod("GET");
														BufferedReader in = new BufferedReader(
																new InputStreamReader(con.getInputStream()));
														String inputLine;
														StringBuffer response = new StringBuffer();
														while ((inputLine = in.readLine()) != null) {
															response.append(inputLine);																		}													
														//print result
														String message = "Locating Culinary Genius... \n";
														char[] chars = message.toCharArray();
														for (int i = 0; i < chars.length; i++)  {
															System.out.print(chars[i]);
															Thread.sleep(150); }
														System.out.println(response.toString());
														in.close();
														break;}
												}
											}												
									
												if (answer2.equalsIgnoreCase("cheaper")) {
												try (Scanner input4 = new Scanner(System.in)) {
												System.out.println("How many participants would you like (1-3)?");
												int answer3 = input4.nextInt();
												if (answer3 == 1) {									
													String url = "http://www.boredapi.com/api/activity?type=cooking&maxprice=0.2&participants=1";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Locating Culinary Genius... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
													System.out.print(chars[i]);
													Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												if (answer3 == 2) {									
													String url = "http://www.boredapi.com/api/activity?type=cooking&maxprice=0.3&participants=2";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Locating Culinary Genius... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
													break;}
												if (answer3 == 3) {									
													String url = "http://www.boredapi.com/api/activity?type=cooking&maxprice=0.3&participants=3";
													URL obj = new URL(url);
													HttpURLConnection con = (HttpURLConnection) obj.openConnection();
													// optional default for this API is GET
													con.setRequestMethod("GET");
													BufferedReader in = new BufferedReader(
															new InputStreamReader(con.getInputStream()));
													String inputLine;
													StringBuffer response = new StringBuffer();
													while ((inputLine = in.readLine()) != null) {
														response.append(inputLine);																		}													
													//print result
													String message = "Locating Culinary Genius... \n";
													char[] chars = message.toCharArray();
													for (int i = 0; i < chars.length; i++)  {
														System.out.print(chars[i]);
														Thread.sleep(150); }
													System.out.println(response.toString());
													in.close();
												break;}
												}
										}
								}
												if (answer1.equalsIgnoreCase("music")) {	
													try (Scanner input3 = new Scanner(System.in)) {
														System.out.println("Who doesn't love music, sit back, relax, and we will handle the rest, press '1' to get jamming!");
														String answer2 = input3.nextLine();
														if (answer2.equalsIgnoreCase("yes")) {
															try (Scanner input4 = new Scanner(System.in)) {
																System.out.println("Friends are overated anyways, stick with the name and Do It Yourself, press '1' to continue.");
																int answer3 = input4.nextInt();
																if (answer3 == 1) {									
																	String url = "http://www.boredapi.com/api/activity?type=music&price=0&participants=1";
																	URL obj = new URL(url);
																	HttpURLConnection con = (HttpURLConnection) obj.openConnection();
																	// optional default for this API is GET
																	con.setRequestMethod("GET");
																	BufferedReader in = new BufferedReader(
																			new InputStreamReader(con.getInputStream()));
																	String inputLine;
																	StringBuffer response = new StringBuffer();
																	while ((inputLine = in.readLine()) != null) {
																			response.append(inputLine);																		}													
																	//print result
																	String message = "Loading musical genius... \n";
																	char[] chars = message.toCharArray();
																	for (int i = 0; i < chars.length; i++)  {
																	System.out.print(chars[i]);
																	Thread.sleep(150); }
																	System.out.println(response.toString());
																	in.close();
																			break;}											
															}
														}																					
														if (answer2.equalsIgnoreCase("no")) {
															try (Scanner input4 = new Scanner(System.in)) {
															System.out.println("Who doesn't love music, sit back, relax, and we will handle the ideas, press '1' to get jamming!");
															int answer3 = input4.nextInt();
															if (answer3 == 1) {									
																String url = "http://www.boredapi.com/api/activity?type=music&minprice=0.1&participants=1";
																URL obj = new URL(url);
																HttpURLConnection con = (HttpURLConnection) obj.openConnection();
																// optional default for this API is GET
																con.setRequestMethod("GET");
																BufferedReader in = new BufferedReader(
																		new InputStreamReader(con.getInputStream()));
																String inputLine;
																StringBuffer response = new StringBuffer();
																while ((inputLine = in.readLine()) != null) {
																	response.append(inputLine);																		}													
																//print result
																String message = "Loading musical genius... \n";
																char[] chars = message.toCharArray();
																for (int i = 0; i < chars.length; i++)  {
																System.out.print(chars[i]);
																Thread.sleep(150); }
																System.out.println(response.toString());
																in.close();
																break;}		
															}
														}
													}
															if (answer1.equalsIgnoreCase("relaxation")) {	
																try (Scanner input3 = new Scanner(System.in)) {
																	System.out.println("So you wanna relax, just press '1' and we will handle all your thinking, don't let boredom beat ya!");
																	String answer2 = input3.nextLine();
																	if (answer2.equalsIgnoreCase("yes")) {
																		try (Scanner input4 = new Scanner(System.in)) {
																			System.out.println("Friends are overated anyways, stick with the name and Do It Yourself, press '1' to continue.");
																			int answer3 = input4.nextInt();
																			if (answer3 == 1) {									
																				String url = "http://www.boredapi.com/api/activity?type=relaxation&price=0&participants=1";
																				URL obj = new URL(url);
																				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
																				// optional default for this API is GET
																				con.setRequestMethod("GET");
																				BufferedReader in = new BufferedReader(
																						new InputStreamReader(con.getInputStream()));
																				String inputLine;
																				StringBuffer response = new StringBuffer();
																				while ((inputLine = in.readLine()) != null) {
																						response.append(inputLine);																		}													
																				//print result
																				String message = "Achieving Tranquility... \n";
																				char[] chars = message.toCharArray();
																				for (int i = 0; i < chars.length; i++)  {
																				System.out.print(chars[i]);
																				Thread.sleep(150); }
																				System.out.println(response.toString());
																				in.close();
																						break;}		
																			
																		}
																	}																					
																	if (answer2.equalsIgnoreCase("no")) {
																		try (Scanner input4 = new Scanner(System.in)) {
																		System.out.println("\"So you wanna relax, just press '1' and we will handle all your thinking, don't let boredom beat ya!");
																		int answer3 = input4.nextInt();
																		if (answer3 == 1) {									
																			String url = "http://www.boredapi.com/api/activity?type=relaxation&minprice=0.1&participants=1";
																			URL obj = new URL(url);
																			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
																			// optional default for this API is GET
																			con.setRequestMethod("GET");
																			BufferedReader in = new BufferedReader(
																					new InputStreamReader(con.getInputStream()));
																			String inputLine;
																			StringBuffer response = new StringBuffer();
																			while ((inputLine = in.readLine()) != null) {
																				response.append(inputLine);																		}													
																			//print result
																			String message = "Achieving Tranquility... \n";
																			char[] chars = message.toCharArray();
																			for (int i = 0; i < chars.length; i++)  {
																			System.out.print(chars[i]);
																			Thread.sleep(150); }
																			System.out.println(response.toString());
																			in.close();
																			break;}	
															}
														}
													}
																
												}
															
									}
								} else { System.out.println("Please restart program and try again.");
									break;}
							}
										
					}
			}
	}
}
						

									
										
																