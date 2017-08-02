-- Exported from QuickDBD: https://www.quickdatatabasediagrams.com/
-- Link to schema: https://app.quickdatabasediagrams.com/#/schema/oVRvlacbT0mL3c079UYRMQ
-- NOTE! If you have used non-SQL datatypes in your design, you will have to change these here.

SET XACT_ABORT ON

BEGIN TRANSACTION QUICKDBD

CREATE TABLE [User] (
    [UserID] int  NOT NULL ,
    [Name] string  NOT NULL ,
    CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED (
        [UserID] ASC
    )
)

CREATE TABLE [AddressBook] (
    [AddressBookID] int  NOT NULL ,
    [UserId] int  NOT NULL ,
    CONSTRAINT [PK_AddressBook] PRIMARY KEY CLUSTERED (
        [AddressBookID] ASC
    )
)

CREATE TABLE [AddressContact] (
    [AddressContactID] int  NOT NULL ,
    [AddressBookID] int  NOT NULL ,
    [FirstName] string  NOT NULL ,
    [LastName] string  NOT NULL ,
    [Company] string  NOT NULL ,
    [HomePhone] varchar  NOT NULL ,
    [WorkPhone] varchar  NOT NULL ,
    CONSTRAINT [PK_AddressContact] PRIMARY KEY CLUSTERED (
        [AddressContactID] ASC
    )
)

CREATE TABLE [AddressContactRelationship] (
    [AddressContactRelationship] int  NOT NULL ,
    [AddressContactID] int  NOT NULL ,
    [StreetAddressID] int  NOT NULL ,
    [TypeID] int  NOT NULL ,
    CONSTRAINT [PK_AddressContactRelationship] PRIMARY KEY CLUSTERED (
        [AddressContactRelationship] ASC
    )
)

CREATE TABLE [AddressType] (
    [AddressTypeID] int  NOT NULL ,
    [TypeName] varchar  NOT NULL ,
    CONSTRAINT [PK_AddressType] PRIMARY KEY CLUSTERED (
        [AddressTypeID] ASC
    )
)

CREATE TABLE [StreetAddress] (
    [StreetAddressID] int  NOT NULL ,
    [Street] string  NOT NULL ,
    [StreetNumber] varchar  NOT NULL ,
    [CountryCitiesID] int  NOT NULL ,
    [ZIP] varchar  NOT NULL ,
    CONSTRAINT [PK_StreetAddress] PRIMARY KEY CLUSTERED (
        [StreetAddressID] ASC
    )
)

CREATE TABLE [Country] (
    [CountryID] int  NOT NULL ,
    [CountryName] string  NOT NULL ,
    CONSTRAINT [PK_Country] PRIMARY KEY CLUSTERED (
        [CountryID] ASC
    )
)

CREATE TABLE [City] (
    [CityID] int  NOT NULL ,
    [CityName] string  NOT NULL ,
    CONSTRAINT [PK_City] PRIMARY KEY CLUSTERED (
        [CityID] ASC
    )
)

CREATE TABLE [CountryCities] (
    [CountryCitiesID] int  NOT NULL ,
    [CountryID] int  NOT NULL ,
    [CityID] int  NOT NULL ,
    CONSTRAINT [PK_CountryCities] PRIMARY KEY CLUSTERED (
        [CountryCitiesID] ASC
    )
)

ALTER TABLE [AddressBook] WITH CHECK ADD CONSTRAINT [FK_AddressBook_UserId] FOREIGN KEY([UserId])
REFERENCES [User] ([UserID])

ALTER TABLE [AddressBook] CHECK CONSTRAINT [FK_AddressBook_UserId]

ALTER TABLE [AddressContact] WITH CHECK ADD CONSTRAINT [FK_AddressContact_AddressBookID] FOREIGN KEY([AddressBookID])
REFERENCES [AddressBook] ([AddressBookID])

ALTER TABLE [AddressContact] CHECK CONSTRAINT [FK_AddressContact_AddressBookID]

ALTER TABLE [AddressContactRelationship] WITH CHECK ADD CONSTRAINT [FK_AddressContactRelationship_AddressContactID] FOREIGN KEY([AddressContactID])
REFERENCES [AddressContact] ([AddressContactID])

ALTER TABLE [AddressContactRelationship] CHECK CONSTRAINT [FK_AddressContactRelationship_AddressContactID]

ALTER TABLE [AddressContactRelationship] WITH CHECK ADD CONSTRAINT [FK_AddressContactRelationship_StreetAddressID] FOREIGN KEY([StreetAddressID])
REFERENCES [StreetAddress] ([StreetAddressID])

ALTER TABLE [AddressContactRelationship] CHECK CONSTRAINT [FK_AddressContactRelationship_StreetAddressID]

ALTER TABLE [AddressContactRelationship] WITH CHECK ADD CONSTRAINT [FK_AddressContactRelationship_TypeID] FOREIGN KEY([TypeID])
REFERENCES [AddressType] ([AddressTypeID])

ALTER TABLE [AddressContactRelationship] CHECK CONSTRAINT [FK_AddressContactRelationship_TypeID]

ALTER TABLE [StreetAddress] WITH CHECK ADD CONSTRAINT [FK_StreetAddress_CountryCitiesID] FOREIGN KEY([CountryCitiesID])
REFERENCES [CountryCities] ([CountryCitiesID])

ALTER TABLE [StreetAddress] CHECK CONSTRAINT [FK_StreetAddress_CountryCitiesID]

ALTER TABLE [CountryCities] WITH CHECK ADD CONSTRAINT [FK_CountryCities_CountryID] FOREIGN KEY([CountryID])
REFERENCES [Country] ([CountryID])

ALTER TABLE [CountryCities] CHECK CONSTRAINT [FK_CountryCities_CountryID]

ALTER TABLE [CountryCities] WITH CHECK ADD CONSTRAINT [FK_CountryCities_CityID] FOREIGN KEY([CityID])
REFERENCES [City] ([CityID])

ALTER TABLE [CountryCities] CHECK CONSTRAINT [FK_CountryCities_CityID]

COMMIT TRANSACTION QUICKDBD