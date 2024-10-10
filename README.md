
Project Overview
The Store Application is a pharmaceutical inventory management system. It handles various operations such as managing drugs, invoices, suppliers, and stock levels, including both main stock and sub-stock. The application also tracks discarded items.

![Module](https://github.com/AhmedRamadan29/StokMedicines/assets/137803511/bc8e32ac-a78e-401f-bc51-181ab92a9d19)

Database Schema
Database Name: database_mi

Tables
Drugs Table:

Purpose: Stores information about the drugs in inventory.
Key Fields: ID, product name, start date, end date, expiry status, product count, unit stock type, supplier name, prices, and stock type (main or sub).
Substock Table:

Purpose: Manages sub-stock levels.
Key Fields: Store ID, product name, total product count, start and end dates, unit type, letter, stock type, supplier name, and total cost.
Main Stock Table:

Purpose: Manages main stock levels.
Key Fields: ID, product name, total product count, shelf location, unit stock type, letter, invoice number, supplier name, start and end dates, expiry status, and total cost.
Invoices Table:

Purpose: Stores invoice details.
Key Fields: Invoice ID, invoice number, product name, total product count, unit type, start and end dates, total cost, supplier name, prices, payment type, letter, and stock type.
Suppliers Table:

Purpose: Manages supplier information.
Key Fields: ID, supplier name, address, phone number, payment type, and email.
Discarded Items Stock Table:

Purpose: Tracks discarded items due to expiration, destruction, or other reasons.
Key Fields: Product ID, product name, count, unit type, prices, letter, store type, employee information, department details, and damage type.
Project Structure
Controllers:

DrugController: Manages operations related to drugs.
LetterController: Manages operations related to letters.
SupplierController: Manages operations related to suppliers.
DTOs (Data Transfer Objects):

Used for transferring data between different layers of the application.
Includes classes like DrugDTO, InvoiceDTO, LettersDTO, MainStokDTO, SubstokDTO, SupplierDTO, and DiscardedItemsStokDTO.
Entities:

Represents the data structure of the tables in the database.
Includes classes like DrugE, MainStokE, SubstokE, SupplierE, InvoiceE, and LetterE.
Enums:

Defines fixed sets of constants.
Includes Stok (Main, Sub) and UnitStok (Box, Carton, Tape, etc.).
Lambdas:

Contains lambda functions for performing operations on drugs.
Example: Getting all drugs, finding drugs by ID, deleting drugs, updating drugs, and inserting new drugs.
Mapper:

Utility classes for converting between entities and DTOs.
Includes a class called MapperALL.
Repositories:

Interfaces for interacting with the database.
Includes DrugRepository, SupplierRepository, InvoiceRepository, MainStokRepository, and SubstokRepository.
Services:

Contains the business logic for the application.
Includes classes like DiscardedItemsStokServices, DrugServices, InvoiceServices, LettersService, MainStokServices, SubstokServices, and SupplierService.
Running the Application
To run the application, use the following command: mvn spring-boot:run







