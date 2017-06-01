package org.anantacreative.updater.Update;

/**
 * Типы экшенов обновления
 */
public enum ActionType {

    MOVE("Move"),
    RENAME("Rename"),
    DELETE_DIR("DeleteDir"),
    DELETE_FILES("DeleteFiles"),
    UNPACK("UnPack"),
    PACK("Pack"),
    RUN("Run"),
    COPY_FILES("CopyFiles"),
    COPY_DIR("CopyDir"),
    UNKNOWN("");

    private String typeName;

    ActionType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public static ActionType getType(String type) {

            for(ActionType at : ActionType.values()) if(at.getTypeName().equals(type)) return at;
            return UNKNOWN;


    }
}
