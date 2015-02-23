/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2015 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.EventObject;

/**
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public class StatementEvent extends EventObject {

    private static final long serialVersionUID = -8089573731826608315L;

    private final SQLException exception;
    private final PreparedStatement statement;

    public StatementEvent(final PooledConnection source, final PreparedStatement statement, final SQLException exception) {
        super(source);
        this.statement = statement;
        this.exception = exception;
    }

    public StatementEvent(final PooledConnection source, final PreparedStatement statement) {
        super(source);
        this.statement = statement;
        this.exception = null;
    }

    public PreparedStatement getStatement() {
        return statement;
    }

    public SQLException getSQLException() {
        return exception;
    }
}
