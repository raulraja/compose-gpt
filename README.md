# ComposeGPT - A simple demonstration using xef.ai library

## Description
ComposeGPT is a simple demonstration application using the xef.ai library, and the GPT-3.5 Turbo model for indexing and answering questions based on a variety of sources including web URLs and PDF documents. The program is designed for exploration and modification - we encourage users to clone the repository, add their own data sources, and see what ComposeGPT can do!

## Features
- Utilizes xef.ai library for AI functionalities.
- Scrapes content from provided URLs.
- Indexes content from provided PDF documents.
- Uses GPT-3.5 Turbo model for text splitting and generating answers.
- Works in an interactive console mode, receiving questions from users and generating AI-based answers.

## Prerequisites
Ensure you have Kotlin and the necessary dependencies installed. You'll also need an environment variable `OPENAI_TOKEN` set with your OpenAI API token.

## Installation and Setup
To get the repository into your local environment, use the standard method for cloning a repository from your preferred Git interface.

Once the repository is in your local environment, navigate into the directory and open the project in your favorite IDE.

## Usage
To run the application, simply run the main method in your IDE or use the terminal:

Upon starting, the application will index the contents of the provided URLs and PDFs. Once the indexing process is completed, it will ask the user to enter a question.

The application will then generate an answer based on the indexed content and print it out. This process will continue until the application is stopped or until the user provides no input when asked for a question.

## Customization
You're encouraged to modify the source URLs and PDFs by cloning the repository and modifying the `sourceUrls` and `pdfs` lists respectively. Ensure that your sources are accessible and contain readable text.

## Contributing
If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.

## Licensing
The code in this project is licensed under Apache License 2.0.
