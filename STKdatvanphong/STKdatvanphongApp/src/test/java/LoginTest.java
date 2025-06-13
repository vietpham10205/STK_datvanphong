/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import stkdatvanphongapp.Controller;

public class LoginTest {

    @Test
    public void testNguoiThue() {
        Controller control=new Controller();
        assertEquals(1, control.CheckLogin("renter01@gmail.com", "hashed_pwd5"));
        assertEquals(1, control.CheckLogin("nguyenvana@gmail.com", "12345"));

    }
    @Test
    public void testKhacNguoiThue()
    {
                Controller control=new Controller();
        assertEquals(3, control.CheckLogin("alpha@company.vn", "hashed_pwd3"));
        assertEquals(3, control.CheckLogin("vit@gmail.com", "1234567890"));
        assertEquals(3, control.CheckLogin("manager01@bizrent.vn", "hashed_pwd2"));
        assertEquals(3, control.CheckLogin("beta@company.vn", "hashed_pwd4"));
        assertEquals(3, control.CheckLogin("admin01@bizrent.vn", "hashed_pwd1"));
    }
    @Test
    public void testBanned()
    {
        Controller control=new Controller();
        assertEquals(2, control.CheckLogin("banned01@example.com", "hashed_banned_pw1"));
        assertEquals(2, control.CheckLogin("banned02@example.com", "hashed_banned_pw2"));
        assertEquals(2, control.CheckLogin("banned03@example.com", "hashed_banned_pw3"));
    }
    @Test
    public void testNotFound()
    {
        Controller control=new Controller();             
        assertEquals(0,control.CheckLogin("NguyenVanB@gmail.com", "NVBpass"));
        assertEquals(0,control.CheckLogin("TrinhThiC@gmail.com", "TTCpass"));
        assertEquals(0,control.CheckLogin("HoangVanD@gmail.com", "hoangvandmkpass"));
    }
}

