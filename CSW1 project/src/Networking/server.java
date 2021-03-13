package Networking;
import java.io.*;
import java.net.*;


public class server {
	class RequestProcessor extends Thread { 	//for multi-threaded server
		private Socket socket;
		
		RequestProcessor(Socket socket) {
			this.socket=socket;
			start(); // will load the run method 
		}
		
		public void run() {
			try {
		   //Declaring properties and streams
				OutputStream outputStream;
				OutputStreamWriter outputStreamWriter;
				InputStream inputStream;
				InputStreamReader inputStreamReader;
				StringBuffer stringBuffer;
				String response;
				String request;
				int x;
			
				int temp1,temp2,temp3,temp4,temp5;
				String part1,part2,part3,part4,part5,part6;
				
				String name;
				int rollno;
				String course;
				long phno;
				String email;
				long id;
			
			//getting input stream and its reader, for reading request or acknowledgement
				inputStream=socket.getInputStream(); 
				inputStreamReader=new InputStreamReader(inputStream);
				stringBuffer=new StringBuffer();
				
				while(true) {
					x=inputStreamReader.read();
					if(x=='#' || x==-1) break; //reads until terminator
					stringBuffer.append((char)x); 
				}
				
				request=stringBuffer.toString();
				System.out.println("Request : "+request);
			
			//parsing and extracting Request data
				temp1=request.indexOf(",");
				temp2=request.indexOf(",",temp1+1);
				temp3=request.indexOf(",",temp2+1);
				temp4=request.indexOf(",",temp3+1);
				temp5=request.indexOf(",",temp4+1);
							
				part1=request.substring(0,temp1);
				part2=request.substring(temp1+1,temp2);
				part3=request.substring(temp2+1,temp3);
				part4=request.substring(temp3+1,temp4);
				part5=request.substring(temp4+1,temp5);
				part6=request.substring(temp5+1);
			
				name=part1;
				rollno=Integer.parseInt(part2);
				course=part3;
				phno=Long.parseLong(part4);
				email=part5;
				id=Long.parseLong(part6);
				
				System.out.println("Name : "+name);
				System.out.println("Roll number : "+rollno);
				System.out.println("Course : "+course);
				System.out.println("Phone number : "+phno);
				System.out.println("Email : "+email);
				System.out.println("ID : "+id);
	 
			// handle data
			//sending response
				response="Data saved#";

			//get output stream and its writer, for sending response or acknowledgement
				outputStream=socket.getOutputStream();
				outputStreamWriter=new OutputStreamWriter(outputStream);
				outputStreamWriter.write(response);
				outputStreamWriter.flush(); // response sent
				System.out.println("Response sent");
				socket.close(); //terminating connection
			}
			catch(Exception exception) {
				System.out.println(exception);
			}
		}
	}
	public class Server {
		private ServerSocket serverSocket;
		private int portNumber;
		
		Server(int portNumber) {
			this.portNumber=portNumber;
			try {
		//Initiating ServerSocket with TCP port
				serverSocket=new ServerSocket(this.portNumber); 
				startListening(); 
			}
			catch(Exception e) {
				System.out.println(e);
				System.exit(0); 
			}
		}
		
		private void startListening() {
			try {
				Socket socket;
				
				while(true) {
					System.out.println("Server is listening on port : "+this.portNumber);
					socket=serverSocket.accept(); // server is in listening mode
					System.out.println("Request arrived..");
		
				// diverting the request to processor with the socket reference
					new RequestProcessor(socket); 
				}
			}
			catch(Exception e) {
				System.out.println(e); 
			}
		}


	public void main(String[] args) {
		String[] data = null;
		// TODO Auto-generated method stub
		int portNumber=Integer.parseInt(data[0]);
		Server server=new Server(portNumber); 


	}
	}

}
