public class SpacedLogger implements Logger {

    @Override
    public void log(String log) {
        String result = "";
        for(char c : log.toCharArray()) {
            result += c + " ";
        }        
        result = result.trim();
        System.out.println(result);
    }

    @Override
    public void error(String error) {
        System.out.print("ERROR: ");        
        log(error);
    }
    
}
