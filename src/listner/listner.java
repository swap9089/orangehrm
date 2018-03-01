package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcase started and details are "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase success and details are "+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failure and details are "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase skipped and details are "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("testcase percentage and details are "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}


