package com.h.inputoutput.practise;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
	public static void main (String args[]) throws IOException, InterruptedException
	{
		final PipedInputStream pis=new PipedInputStream();
		final PipedOutputStream pos=new PipedOutputStream();
		
		//Connect pipe
		
		pis.connect(pos);
		Thread pipeWriter=new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=65; i<91; i++)
				{
					try
					{
						pos.write(i);
						Thread.sleep(500);
					}
					catch(IOException | InterruptedException e)
					{
						e.printStackTrace();
						
					}
				}
			}
			
				});
		Thread pipeReader =new Thread(new Runnable()
			{
			@Override
			public void run()
			{
				for(int i=65; i<91;i++)
				{
					try
					{
						System.out.print((char)pis.read());
						Thread.sleep(1000);
					}
					catch(IOException | InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			
				});
		pipeWriter.start();
		pipeReader.start();
		pipeWriter.join();
		pipeReader.join();
		pos.close();
		pis.close();
		
	}

}
