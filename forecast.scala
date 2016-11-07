case class Error()
case class UserInput()
case class Location()
case class Forecast()

def checkRateLimit(input: UserInput): Either[Error,Unit] = Right(Unit)
def geolocate(input: UserInput): Either[Error,Location] = Right(Location())
def findForecast(loc: Location): Either[Error,Forecast] = Right(Forecast())

val input = UserInput()

val forecast: Either[Error,Forecast] = for {
    rateLimited  <- checkRateLimit(input)
    userLocation <- geolocate(input)
    forecast     <- findForecast(userLocation)
} yield (forecast)
