# Bird Tracker

Bird Tracker is a simple Java program designed to manage a collection of bird sightings. It allows users to add new birds, record observations for existing birds, and view details of all birds or specific ones.

## Bird Class

The `Bird` class represents individual birds and includes methods to set and get their attributes such as name, Latin name, and number of observations. Additionally, the `toString` method is overridden to provide a readable representation of a bird object.

## BirdFunctions Class

The `BirdFunctions` class contains static methods to perform operations on the collection of birds. These methods include adding new birds, recording observations for existing birds, and displaying details of all birds or a specific one.

## BirdUI Class

The `BirdUI` class serves as the user interface for the program. It prompts users for commands and interacts with the `BirdFunctions` class to perform the requested actions. Users can add new birds, record observations, and view bird details using this interface.

## Features

- **Add Bird:** Users can add a new bird by providing its name and Latin name.
  
- **Record Observations:** Users can record observations for existing birds by specifying the bird's name and the number of observations.
  
- **View Bird Details:** Users can view details of all birds in the collection or details of a specific bird.

