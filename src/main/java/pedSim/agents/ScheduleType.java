package pedSim.agents;

/**
 * Defines the daily routine schedule for an agent, determining when they leave
 * home.
 */
public enum ScheduleType {
    StandardWorker, // 9-to-5 style: Leave AM, Return PM
    PartTimeWorker, // Shorter/Irregular hours
    Student, // School hours
    Shopper, // Mid-day trips
    EveningSocializer, // Evening trips
    NightShift, // Late night trips
    Homebody // Rarely leaves
}
