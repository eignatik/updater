package org.anantacreative.updater.Update;

/**
 * Типы экшенов обновления
 */
public enum ActionType {

    MOVE("Move"),
    RENAME("Rename"),
    MOVE_IN("MoveIn"),
    DELETE_DIR("DeleteDir"),
    DELETE_FILES("DeleteFiles"),
    UNPACK("Unpack"),
    PACK_DIR("PackDir"),
    PACK_FILES("PackFiles"),
    RUN("Run"),
    RUN_IN("RunIn"),
    COPY_FILES("CopyFiles"),
    COPY_DIR("CopyDir"),
    UNKNOWN("");

    private String typeName;

    ActionType(String typeName) {
        this.typeName = typeName;
    }


    public static ActionType getType(String type) {
        try {
            return ActionType.valueOf(type);
        } catch (Exception e) {
            return UNKNOWN;
        }

    }
}
