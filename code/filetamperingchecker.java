import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class filetamperingchecker 
    {
        public static void main(String[] args) throws IOException
        {
                JButton select = new JButton();
                JFileChooser f1 = new JFileChooser();
                f1.setCurrentDirectory(new java.io.File(""));
                f1.setDialogTitle("File tampering checker");

                if (f1.showOpenDialog(select) == JFileChooser.APPROVE_OPTION) 
                        {
                            System.out.println("NOTE: If you not get the hash value, Please remove the space in the file name: "+f1.getSelectedFile().getAbsolutePath());
                            Process p= Runtime.getRuntime().exec("cmd /c Certutil -hashfile"+f1.getSelectedFile().getAbsolutePath());
                            String s;
                            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                            while((s=stdInput.readLine())!=null)
                                {
                                    String s1 = s.replace("SHA1 hash of ", "");
                                    String s2 = s1.replace(f1.getSelectedFile().getAbsolutePath(), "");
                                    String s3 = s2.replace(":", "");
                                    String s4 = s3.replace("CertUtil -hashfile command completed successfully.", "");
                                    String s5 = s4.replace("CertUtil -hashfile command FAILED 0x80070002 (WIN32 2 ERROR_FILE_NOT_FOUND)", "");
                                    String s6 = s5.replace("CertUtil The system cannot find the file specified.", "");
                                    System.out.println(s6);
                                }
                        }
                 else   {
                            JOptionPane.showMessageDialog(null, "Please select any file");
                        }
        }
    }