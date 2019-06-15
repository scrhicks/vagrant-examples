# Jekyll

## Requirements
- VirtualBox
- Vagrant

## Setup
To create a virtual machine with Jekyll run 
```bash
vagrant up
```

It will download the latest ubuntu bionic vagrant box and then install Ruby and Jekyll on it. 

After that, you can log in to the VM using command 
```
vagrant ssh
```
To verify if Jekyll is properly installed use `jekyll -v`.

Use `vagrant halt` command to shutdown VM and `vagrant destroy` to shutdown and remove it from your local disk.

## Create sample site

1. To create Jekyll site run
    ```bash
    jekyll new myblog
    ```
2. Change directory
    ```
    cd myblog
    ```
3. Run local Jekyll server to serve your site
    ```
    bundle exec jekyll serve -H 0.0.0.0
    ```

4. Browse to http://localhost:4000