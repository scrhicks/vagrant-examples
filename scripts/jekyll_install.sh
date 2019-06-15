#!/bin/bash

echo "################################################################"
echo "# Install Ruby 2.5"
echo "################################################################"
sudo apt-add-repository -y ppa:brightbox/ruby-ng
sudo apt-get update
sudo apt-get -y install ruby2.5 ruby2.5-dev build-essential dh-autoreconf

echo "################################################################"
echo "# Update Ruby gems"
echo "################################################################"
gem update

echo "################################################################"
echo "# Install Jekyll"
echo "################################################################"
gem install jekyll bundler