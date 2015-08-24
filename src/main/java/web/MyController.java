package web;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.sql.*;
import javax.annotation.*;
import javax.persistence.*;
import javax.servlet.http.*;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.multipart.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Controller
public class MyController {
	
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@RequestMapping("/jsp")
	String jsp() {
		return "index-jsp";
	}
}
