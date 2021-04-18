package com.elberthbrandao.dslearn.observers;

import com.elberthbrandao.dslearn.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
}
