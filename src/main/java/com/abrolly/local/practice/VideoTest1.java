package com.abrolly.local.practice;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class VideoTest1 {

	public static void runTestFfmpeg() throws IOException {

		try {
			String target = new String(
					"/Users/saroj/Workspace/abrolly/codebase/maven-java-project/src/main/resources/script1.sh");
			String[] command = {
					"/Users/saroj/Workspace/abrolly/codebase/maven-java-project/src/main/resources/script1.sh" };
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			while ((s = reader.readLine()) != null) {
				System.out.println("Script output: " + s);
			}

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public static void testConsoleOutput() {
		// Create a stream to hold the output
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		// IMPORTANT: Save the old System.out!
		PrintStream old = System.out;
		// Tell Java to use your special stream
		System.setOut(ps);
		// Print some output: goes to your special stream
		System.out.println("Foofoofoo!");
		// Put things back
		System.out.flush();
		System.setOut(old);
		// Show what happened
		System.out.println("Here: " + baos.toString());
	}

	public static void test3() throws IOException {
		Runtime rt = Runtime.getRuntime();
		String[] commands = { "/Users/saroj/Workspace/htdocs/vmsg-root/scripts/ffmpeg/MergeVideosDynamicaly.sh",
				"/Users/saroj/Workspace/htdocs/vmsg-root/videos/user-1/project-1", "input-text-1.1", "output-1.1.mp4",
				"vid1.mp4", "vid2.mp4" };
		ProcessBuilder pb = new ProcessBuilder("/Users/saroj/Workspace/htdocs/vmsg-root/scripts/ffmpeg/MergeVideosDynamicaly.sh",
				"/Users/saroj/Workspace/htdocs/vmsg-root/users-projects/user-1/project-1", "input-text-1.1.txt", "output-1.1.mp4",
				"vid1.mp4", "vid2.mp4");
		
		
		Process proc = pb.start();

		BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

		// read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}

		// read any errors from the attempted command
		System.out.println("\nHere is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
			System.out.println(s);
		}
	}

}
