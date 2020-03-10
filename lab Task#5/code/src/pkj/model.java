package pkj;

public class model {
	public boolean verify_email_address (String mail) {
		String s1 = mail;
		int size = s1.length();
		char array[];
		array = new char[size];
		String[] str = null;
		boolean flag = false;
		int ascii;
		int count = 0;
		for(int i = 0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c=='@') {
				count++;
			}
			array[i] = c;
		}
		int i=0;
		while(i!=s1.length()) {
			ascii = (int)array[i];
			if(s1.length()==1) {
				flag = false;
				break;
			}
			if(array[i] == '@') {
				str = s1.split("@");
				if(str[1].equals("gmail.com") || str[1].equals("hotmail.com") || str[1].equals("live.com") || str[1].equals("yahoo.com")) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
				
			}
			if(count>1 || count == 0) {
				flag = false;
				break;
			}
			if((ascii > 96 && ascii < 123) || (ascii > 63 && ascii < 91) || (ascii==46) || (ascii==45) || (ascii > 47 && ascii < 58)){
				flag = true;
			}
			else {
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}

}