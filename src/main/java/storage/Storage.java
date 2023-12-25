package storage;

import java.time.Duration;

public class Storage {
    private String id;
    private StorageType storageType;
    private String connectionParams;
    private long maxStorageSize;
    private int storedFilesCount;
    private long totalStoredSize;
    private long totalFreeSize;
    private LogicalGroup logicalGroup;
    private int priority;
    private Duration fileRetentionTime;
    private boolean isActive;

    public Storage(){

    }

    public Storage(String id, StorageType storageType, String connectionParams, long maxStorageSize, int storedFilesCount, long totalStoredSize, long totalFreeSize, LogicalGroup logicalGroup, int priority, Duration fileRetentionTime, boolean isActive) {
        this.id = id;
        this.storageType = storageType;
        this.connectionParams = connectionParams;
        this.maxStorageSize = maxStorageSize;
        this.storedFilesCount = storedFilesCount;
        this.totalStoredSize = totalStoredSize;
        this.totalFreeSize = totalFreeSize;
        this.logicalGroup = logicalGroup;
        this.priority = priority;
        this.fileRetentionTime = fileRetentionTime;
        this.isActive = isActive;
    }

    public long calculateAvailableSpace() {
        return maxStorageSize - totalStoredSize;
    }

    public void incrementStoredFilesCount() {
        storedFilesCount++;
    }

    public void incrementStoredSize(long fileSize) {
        totalStoredSize += fileSize;
    }
}
