package br.com.surb.surbeventos.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Block implements Serializable {

    @Serial
    private static final long serialVersionUID = -4872534519821726949L;

    private Long blockId;
    private Instant start;
    private Instant end;

    public Block() {
    }

    public Block(Long blockId, Instant start, Instant end) {
        this.blockId = blockId;
        this.start = start;
        this.end = end;
    }

    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Block block = (Block) object;
        return Objects.equals(blockId, block.blockId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockId);
    }
}
