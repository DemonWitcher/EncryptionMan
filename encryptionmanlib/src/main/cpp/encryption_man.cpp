#include <jni.h>
#include "aes_encryptor.h"

JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_encryptAes(JNIEnv *env, jclass type,
                                                               jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);
    unsigned char *key = {};
    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}

JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_decryptAes(JNIEnv *env, jclass type,
                                                               jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);

    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}

JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_encryptRsa(JNIEnv *env, jclass type,
                                                               jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);

    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}
JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_decryptRsa(JNIEnv *env,jclass type,
                                                               jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);

    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}

JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_md5(JNIEnv *env, jclass type, jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);

    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}

JNIEXPORT jstring JNICALL
Java_com_witcher_encryptionmanlib_EncryptionManager_base64(JNIEnv *env, jclass type,
                                                           jstring source_) {
    const char *source = env->GetStringUTFChars(source_, 0);

    // TODO

    env->ReleaseStringUTFChars(source_, source);

    return env->NewStringUTF("");
}