class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");

            // Simulating exception
            int a = 10 / 0;

        } catch (Exception e) {
            System.out.println("Error occurred while reading file");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}