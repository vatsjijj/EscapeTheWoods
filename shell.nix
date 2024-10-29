let
  pkgs = import (fetchTarball "https://github.com/NixOS/nixpkgs/archive/2fcea20ca076cf1b28cf96c8f8ad2056b1c3221f.tar.gz") {};
in pkgs.mkShell {
  packages = with pkgs; [
    temurin-bin-21
    gradle
  ];
}