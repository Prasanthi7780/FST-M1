
class activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;

        // Seconds in one Earth year
        double EarthSeconds = 31557600;

        // Orbital periods relative to Earth
        double Mercury = 0.2408467;
        double Venus = 0.61519726;
        double Mars = 1.8808158;
        double Jupiter = 11.862615;
        double Saturn = 29.447498;
        double Uranus = 84.016846;
        double Neptune = 164.79132;

        // Calculate age on each planet
        double ageEarth = seconds / EarthSeconds;
        double ageMercury = ageEarth / Mercury;
        double ageVenus = ageEarth / Venus;
        double ageMars = ageEarth / Mars;
        double ageJupiter = ageEarth / Jupiter;
        double ageSaturn = ageEarth / Saturn;
        double ageUranus = ageEarth / Uranus;
        double ageNeptune = ageEarth / Neptune;

        // Print ages
        System.out.println("Age on Earth: " + ageEarth);
        System.out.println("Age on Mercury: " + ageMercury);
        System.out.println("Age on Venus: " + ageVenus);
        System.out.println("Age on Mars: " + ageMars);
        System.out.println("Age on Jupiter: " + ageJupiter);
        System.out.println("Age on Saturn: " + ageSaturn);
        System.out.println("Age on Uranus: " + ageUranus);
        System.out.println("Age on Neptune: " + ageNeptune);
    }
}
