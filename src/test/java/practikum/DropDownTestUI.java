package practikum;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DropDownTestUI extends BaseUITest{
    MainPage mainPage = new MainPage(webDriver);

    @Test
    public void checkFirstButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(0, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.firstanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkSecondButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(1, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.secondanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkThirdButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(2, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.thirdanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkFourthButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(3, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.fourthtanswer, baseButtonBlock.getAnswer());
    }


    @Test
    public void checkFifthButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(4, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.fifthtanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkSixthButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(5, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.sixthanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkSevenButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(6, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.sevenanswer, baseButtonBlock.getAnswer());
    }

    @Test
    public void checkEigthButton(){
        mainPage.open();
        BaseButtonBlock baseButtonBlock = new BaseButtonBlock(7, webDriver);
        baseButtonBlock.clickButton();
        assertEquals(MainPageAnswer.The8thanswer,baseButtonBlock.getAnswer());
    }
}

