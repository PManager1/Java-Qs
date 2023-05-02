package Today;

public class IsshP_movies {
}


//    As an exercise for this question, we’d like to talk through how we might build a video streaming service like
//    Netflix, or Disney+. Of course these are big complex systems, so we’ll just talk about a couple of key features.
//    We want to support lots of users, so we need to make sure the system is designed for "performance."
//
//        There are "three main customer use cases" we’ll need to support with our MVP:
//
//        Customers should be able to browse the TV shows and movies we have in our catalog.
//        We’ll list titles by genre and perhaps other "categories" like “recently added” or “top ten”.
//        Customers should be able to play videos at different resolutions on different devices.
//        We should remember the customer’s play position so they can finish a movie they started the day before.
//        You can assume supporting services like user management, signup, billing and so on are available. We’ll only talk about these three main use cases to begin with.
//
//        This is a large system and we care about performance. To give you a sense of the scale, you can assume:
//
//        We have tens of thousands of titles, and petabytes of media.
//        We have millions of customers, and one million concurrent views.
