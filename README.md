Description
The Currency Converter program is a Java application designed to convert amounts between different currencies using object-oriented programming principles. The program is structured to be modular and extensible, allowing easy addition of new currencies and functionalities in the future.

Components

Currency Class:
Purpose: Provides a base class for different currencies.
Methods: Includes methods for currency attributes such as getting and setting currency code and name.

Specific Currency Classes (Pound, Rupee, USD, CAD, Euro):
Purpose: Inherit from the Currency class and represent specific currencies.
Features: Each class can include specific attributes or methods relevant to that currency, though they currently share common functionalities.
Converter Class:

Purpose: Manages the conversion logic between currencies.
Methods: Includes methods for setting exchange rates, performing conversions, and handling currency-specific logic.

ConverterApp Class:
Purpose: The main application class that initializes the currency objects and manages user interactions.
Features: Provides a user interface to input amounts and currencies, perform conversions, and display results.

Features
Modular Design: Easily extendable with new currency classes and conversion methods.
Dynamic Exchange Rates: Supports setting and updating exchange rates.
Extensible Architecture: Future additions of new currencies or functionalities are straightforward and require minimal changes to existing code.

Implementation Details
Encapsulation: Each class encapsulates its specific details, ensuring a clear separation of concerns.
Inheritance: The Currency class serves as a base for all specific currency classes, promoting code reuse.
Polymorphism: Allows the addition of new currency classes with minimal impact on existing conversion logic.

Future Enhancements
Addition of more currency classes to support a wider range of currencies.
Enhanced user interface options, such as graphical interfaces or web-based applications.
Advanced features like real-time exchange rate fetching and historical data analysis.
