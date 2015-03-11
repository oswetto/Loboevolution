package org.lobobrowser.html.jsimpl;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.lobobrowser.html.domimpl.HTMLDocumentImpl;
import org.lobobrowser.html.domimpl.HTMLElementImpl;
import org.lobobrowser.html.w3c.HTMLElement;
import org.lobobrowser.html.w3c.events.UIEvent;
import org.w3c.dom.views.AbstractView;


/**
 * The Class UIEventImpl.
 */
public class UIEventImpl extends EventImpl implements UIEvent {

	/** The detail. */
	private int detail;

	/**
	 * Instantiates a new UI event impl.
	 */
	public UIEventImpl() {
	}

	/**
	 * Instantiates a new UI event impl.
	 *
	 * @param type the type
	 * @param srcElement the src element
	 */
	public UIEventImpl(String type, HTMLElement srcElement) {
		super(type, srcElement);
	}

	/**
	 * Instantiates a new UI event impl.
	 *
	 * @param type the type
	 * @param srcElement the src element
	 * @param mouseEvent the mouse event
	 * @param leafX the leaf x
	 * @param leafY the leaf y
	 */
	public UIEventImpl(String type, HTMLElement srcElement,
			InputEvent mouseEvent, int leafX, int leafY) {
		super(type, srcElement, mouseEvent, leafX, leafY);
	}

	/**
	 * Instantiates a new UI event impl.
	 *
	 * @param type the type
	 * @param srcElement the src element
	 * @param keyEvent the key event
	 */
	public UIEventImpl(String type, HTMLElement srcElement, KeyEvent keyEvent) {
		super(type, srcElement, keyEvent);
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.w3c.events.UIEvent#initUIEvent(java.lang.String, boolean, boolean, org.w3c.dom.views.AbstractView, int)
	 */
	@Override
	public void initUIEvent(String type, boolean canBubble, boolean cancelable,
			AbstractView view, int detail) {

		setType(type);
		setCanBubble(canBubble);
		setCancelable(cancelable);
		this.detail = detail;

	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.jsimpl.EventImpl#getView()
	 */
	@Override
	public AbstractView getView() {
		HTMLElementImpl el = (HTMLElementImpl) this.getSrcElement();
		HTMLDocumentImpl doc = (HTMLDocumentImpl) el.getOwnerDocument();
		return doc.getDefaultView();
	}

	/* (non-Javadoc)
	 * @see org.lobobrowser.html.jsimpl.EventImpl#getDetail()
	 */
	@Override
	public int getDetail() {
		return detail;
	}
}
