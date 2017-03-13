
cmake_minimum_required(VERSION 3.4.1)


add_library(
             libencryptionman
             SHARED
             src/main/cpp/encryption_man.cpp )


find_library(
              log-lib
              log )

target_link_libraries(
                       libencryptionman
                       ${log-lib} )