// @java.file.header

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.design.jcache;

import javax.cache.*;
import javax.cache.event.*;
import java.util.*;

/**
 * TODO: Add class description.
 *
 * @author @java.author
 * @version @java.version
 */
public abstract class JCacheEntryEvent<K, V> extends CacheEntryEvent<K, V> {
    private UUID nodeId;

    protected JCacheEntryEvent(Cache source, EventType eventType, UUID nodeId) {
        super(source, eventType);

        this.nodeId = nodeId;
    }

    public UUID getNodeId() {
        return nodeId;
    }
}
