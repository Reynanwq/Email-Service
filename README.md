# Email Service Backend

This project is a backend implementation of an Email Service that provides an abstraction layer between different email service providers, ensuring failover support for uninterrupted email sending. The application is built using Java Spring Boot and utilizes Amazon SES as one of the email service providers.

## Features

- **Email Sending Abstraction:** The service abstracts the email sending process, allowing easy integration with multiple providers.
  
- **Failover Support:** In case one email service provider faces downtime, the service quickly fails over to an alternative provider, ensuring continuous email delivery.

- **Amazon SES Integration:** Utilizes Amazon Simple Email Service (SES) as one of the supported email service providers.

## Technologies Used

- Java Spring Boot   
- Amazon SES

## Getting Started

### Prerequisites

- [Java](https://www.java.com/) installed
- [Maven](https://maven.apache.org/) build tool installed

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Reynanwq/Email-Service.git
