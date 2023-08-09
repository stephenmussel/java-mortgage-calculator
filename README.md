# Java Mortgage Calculator

#### _Duration: One-Day Sprint_

<br />


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about">About</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>
<br />


<!-- ABOUT THE PROJECT -->

## About

<br />


A Java project building a command line mortgage calculator. The initial goal was to create an MVP that prompted clients
to input their
`Principal`, `Annual Interest Rate`, and `Payment terms (years)` to calculate their monthly mortgage payments.
A `Payment Schedule`
feature was added to provide clients with a clear outline of their future payments. The `Payment Schedule` provided a
new balance for
each payment made until the balance was paid off. This feature was helpful to show users their current progress while
making
payments towards their balance.

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

<br />

* [Java Development Kit](https://www.oracle.com/java/technologies/downloads/)

<p align="right">(<a href="#top">back to top</a>)</p>
<br />


<!-- GETTING STARTED -->

## Getting Started

Use the following instructions to set up a local version.

### Prerequisites

<br />

* [Java Development Kit](https://www.oracle.com/java/technologies/downloads/)

### Installation

<br />

Clone the repo:

  ```
  git clone git@github.com:stephenmussel/java-mortgage-calculator.git
  ```

To run the mortgage calculator in an editor:

  ```
  Select the Main.java file in your src directory. Run the file and enter a value based on the prompts.
  ```

<!-- USAGE EXAMPLES -->

## Usage

<br />  


![MortgageCalculatorPrompts](/images/java-mortgage-calculator-terminal-view-1.png)
<br />

Initial view in Terminal where user is prompted to enter three inputs: `Principal`, `Annual Interest Rate`,
and `Payment terms (years)`
<br />

![PrincipalInputValidation](/images/java-mortgage-calculator-principal-input-validation.png)
<br />

`Principal` input validation where user is prompted to enter input again if value is not between 1,000 and 1,000,000.
<br />

![AnnualInterestRateInputValidation](/images/java-mortgage-calculator-annual-interest-rate-input-validation.png)
<br />

`Annual Interest Rate` input validation where user is prompted to enter input again if value is not between 1 and 30.
<br />

![PaymentTermsInputValidation](/images/java-mortgage-calculator-payment-terms-input-validation.png)
<br />

`Payment terms (years)` input validation where user is prompted to enter input again if value is not between 1 and 30.
<br />

![Feeling](/images/java-mortgage-calculator-terminal-view-2.png)
<br />

This view shows the Payment Schedule based on the `Payment terms (months)` until the balance is `$0.00.`
<br />

<p align="right">(<a href="#top">back to top</a>)</p>
<br />


<!-- CONTACT -->

## Contact

[LinkedIn](https://www.linkedin.com/in/phaydara-vongsavanthong/)  
[GitHub](https://github.com/stephenmussel)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

Thanks to my wife and our dog Laurel for the endless support and daily walks as well as ClickUp for providing a
wonderful tool to assist with direction and focus.

* [Google](http://www.google.com)
* [Intellij](https://www.jetbrains.com/idea/)
* [Mosh](https://codewithmosh.com/)
* [ClickUp](https://app.clickup.com)

<!-- 
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)
-->

<p align="right">(<a href="#top">back to top</a>)</p>
<br />


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
<!-- 
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
-->