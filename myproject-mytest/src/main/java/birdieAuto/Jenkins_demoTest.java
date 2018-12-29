package birdieAuto;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jenkins_demoTest {

			@Test
			public static void testbaidu(){
//				WebDriver driver = new FirefoxDriver();
				System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				        // 与浏览器同步非常重要，必须等待浏览器加载完毕
//				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
			      // 与浏览器同步非常重要，必须等待浏览器加载完毕
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// it will open the 啄木鸟之家 官网首页
				
				driver.get("http://www.morelikethis.top/admin");
				
				// we expect the title “Google “ should be present
				
				String Expectedtitle = "首页 - My Blog";
				// it will fetch the actual title
				
				String Actualtitle = driver.getTitle();
				driver.findElement(By.xpath("//*[@id='loginForm']/div[1]/input")).sendKeys("admin");
				driver.findElement(By.xpath("//*[@id='loginForm']/div[2]/input")).sendKeys("cage123123");
				driver.findElement(By.xpath("//*[@id='loginForm']/input")).click();
				
				System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
				
				// it will compare actual title and expected title
				
//				Assert.assertEquals(Actualtitle, Expectedtitle);
				
				// print out the result
				System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
				driver.close();
				driver.quit();
			}
			
//			@Test
//			public void testwangpan() throws InterruptedException{
//				 Thread.sleep(3000);
//				 System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
//				 WebDriver driver = new ChromeDriver();
////			      driver.manage().window().maximize();
//			        driver.manage().window().setPosition(new Point(100, 50));
//			        driver.manage().deleteAllCookies();
//			        // 与浏览器同步非常重要，必须等待浏览器加载完毕
//			        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 
//			        driver.get("https://pan.baidu.com/");
//			 
//			        Thread.sleep(1000);
//			 
//			        WebElement qqLoginLink = driver
//			                .findElement(By.xpath("/html/body/div[1]/div[3]/div[6]/div/div[4]/div[2]/div/ul/li[2]/a"));
//			        qqLoginLink.click();
//			        Thread.sleep(1000);
//			 
//			        // 获取当前页面句柄
//			        String handle = driver.getWindowHandle();
//			        // 获取所有页面的句柄，并循环判断不是当前的句柄 然后切换到子窗体
//			        for (String handles : driver.getWindowHandles()) {
//			            if (handles.equals(handle))
//			                continue;
//			            driver.switchTo().window(handles);
//			        }
//			 
//			        // 由于登录输入框在frame中，还需要先切换进入frame，否则，也找不到输入框的
//			        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='ptlogin_iframe']")));
//			 
//			        // 调试过程中，如果提示找不到元素，不知道是否切换成功了，可以把当前handler的source打印出来看看
//			        // System.out.println(driver.getPageSource());
//			 
//			        driver.findElement(By.xpath("//*[@id='switcher_plogin']")).click();
//			        driver.findElement(By.xpath("//*[@id='u']")).sendKeys("317409898");
//			        driver.findElement(By.xpath("//*[@id='p']")).sendKeys("xxxxxxxxx");
//			        driver.findElement(By.xpath("//*[@id='login_button']")).click();
//			         
//			        //由于我的账号没绑定手机，点登录后会有个提示，如果直接关闭，可能被判断为还没完成登录，没有会话，所以稍等片刻
//			        Thread.sleep(2000);
//			         
//			        //关闭弹出的子窗体
//			        driver.close();
//			         
//			        //driver.navigate() 下有很多方法，比如后退，刷新等
//			        Thread.sleep(2000);
//			}
			
			

}