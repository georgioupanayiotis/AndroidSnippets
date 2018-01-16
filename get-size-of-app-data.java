// To get size of directory you need sum sizes of all files in this directory and subdirectories.

long sizeOfCacheDir = getCacheDirSize(getCacheDir());
textViewSize.setText("Cache dir size = " + sizeOfCacheDir + " bytes");

private long getCacheDirSize(File file) {
    long size = 0;
    for (File f : file.listFiles()) {
        if (f.listFiles() == null) {
            size = size + f.length();
        } else {
            size = size + getCacheDirSize(f);
        }
    }
    return size;
}
