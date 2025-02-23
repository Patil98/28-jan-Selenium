package Excel_Handling;

import java.util.Map;

public class LoginSteps {

	public static void main(String[] args) {
		// Fetch row data dynamically from Excel
        Map<String, String> loginData = ExcelUtils.getRowData("LoginData", 1);

        // Extract values
        String username = loginData.get("Username");
        String password = loginData.get("Password");
        String url = loginData.get("URL");

        // Print values using sysout
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("URL: " + url);

	}

}
