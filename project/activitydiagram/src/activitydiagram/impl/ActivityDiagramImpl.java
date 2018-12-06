/**
 */
package activitydiagram.impl;

import activitydiagram.ActivityDiagram;
import activitydiagram.ActivityNode;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.DecisionNode;
import activitydiagram.FinalNode;
import activitydiagram.ForkNode;
import activitydiagram.InitialNode;
import activitydiagram.JoinNode;
import activitydiagram.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getInitialNode <em>Initial Node</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getFinalNode <em>Final Node</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getTrasitions <em>Trasitions</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getActivityNodes <em>Activity Nodes</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getForkNodes <em>Fork Nodes</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getJoinNodes <em>Join Nodes</em>}</li>
 *   <li>{@link activitydiagram.impl.ActivityDiagramImpl#getDecisionNodes <em>Decision Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityDiagramImpl extends EObjectImpl implements ActivityDiagram {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialNode() <em>Initial Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialNode()
	 * @generated
	 * @ordered
	 */
	protected InitialNode initialNode;

	/**
	 * The cached value of the '{@link #getFinalNode() <em>Final Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalNode()
	 * @generated
	 * @ordered
	 */
	protected FinalNode finalNode;

	/**
	 * The cached value of the '{@link #getTrasitions() <em>Trasitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> trasitions;

	/**
	 * The cached value of the '{@link #getActivityNodes() <em>Activity Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> activityNodes;

	/**
	 * The cached value of the '{@link #getForkNodes() <em>Fork Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkNode> forkNodes;

	/**
	 * The cached value of the '{@link #getJoinNodes() <em>Join Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinNode> joinNodes;

	/**
	 * The cached value of the '{@link #getDecisionNodes() <em>Decision Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionNode> decisionNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.ACTIVITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ACTIVITY_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode getInitialNode() {
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialNode(InitialNode newInitialNode, NotificationChain msgs) {
		InitialNode oldInitialNode = initialNode;
		initialNode = newInitialNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE, oldInitialNode, newInitialNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialNode(InitialNode newInitialNode) {
		if (newInitialNode != initialNode) {
			NotificationChain msgs = null;
			if (initialNode != null)
				msgs = ((InternalEObject)initialNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE, null, msgs);
			if (newInitialNode != null)
				msgs = ((InternalEObject)newInitialNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE, null, msgs);
			msgs = basicSetInitialNode(newInitialNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE, newInitialNode, newInitialNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode getFinalNode() {
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalNode(FinalNode newFinalNode, NotificationChain msgs) {
		FinalNode oldFinalNode = finalNode;
		finalNode = newFinalNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE, oldFinalNode, newFinalNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalNode(FinalNode newFinalNode) {
		if (newFinalNode != finalNode) {
			NotificationChain msgs = null;
			if (finalNode != null)
				msgs = ((InternalEObject)finalNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE, null, msgs);
			if (newFinalNode != null)
				msgs = ((InternalEObject)newFinalNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE, null, msgs);
			msgs = basicSetFinalNode(newFinalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE, newFinalNode, newFinalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTrasitions() {
		if (trasitions == null) {
			trasitions = new EObjectContainmentEList<Transition>(Transition.class, this, ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS);
		}
		return trasitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getActivityNodes() {
		if (activityNodes == null) {
			activityNodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES);
		}
		return activityNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkNode> getForkNodes() {
		if (forkNodes == null) {
			forkNodes = new EObjectContainmentEList<ForkNode>(ForkNode.class, this, ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES);
		}
		return forkNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinNode> getJoinNodes() {
		if (joinNodes == null) {
			joinNodes = new EObjectContainmentEList<JoinNode>(JoinNode.class, this, ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES);
		}
		return joinNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionNode> getDecisionNodes() {
		if (decisionNodes == null) {
			decisionNodes = new EObjectContainmentEList<DecisionNode>(DecisionNode.class, this, ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES);
		}
		return decisionNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE:
				return basicSetInitialNode(null, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE:
				return basicSetFinalNode(null, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS:
				return ((InternalEList<?>)getTrasitions()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES:
				return ((InternalEList<?>)getActivityNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES:
				return ((InternalEList<?>)getForkNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES:
				return ((InternalEList<?>)getJoinNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES:
				return ((InternalEList<?>)getDecisionNodes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__NAME:
				return getName();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE:
				return getInitialNode();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE:
				return getFinalNode();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS:
				return getTrasitions();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES:
				return getActivityNodes();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES:
				return getForkNodes();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES:
				return getJoinNodes();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES:
				return getDecisionNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE:
				setInitialNode((InitialNode)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE:
				setFinalNode((FinalNode)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS:
				getTrasitions().clear();
				getTrasitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES:
				getActivityNodes().clear();
				getActivityNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES:
				getForkNodes().clear();
				getForkNodes().addAll((Collection<? extends ForkNode>)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES:
				getJoinNodes().clear();
				getJoinNodes().addAll((Collection<? extends JoinNode>)newValue);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES:
				getDecisionNodes().clear();
				getDecisionNodes().addAll((Collection<? extends DecisionNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE:
				setInitialNode((InitialNode)null);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE:
				setFinalNode((FinalNode)null);
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS:
				getTrasitions().clear();
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES:
				getActivityNodes().clear();
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES:
				getForkNodes().clear();
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES:
				getJoinNodes().clear();
				return;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES:
				getDecisionNodes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__INITIAL_NODE:
				return initialNode != null;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FINAL_NODE:
				return finalNode != null;
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__TRASITIONS:
				return trasitions != null && !trasitions.isEmpty();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__ACTIVITY_NODES:
				return activityNodes != null && !activityNodes.isEmpty();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__FORK_NODES:
				return forkNodes != null && !forkNodes.isEmpty();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__JOIN_NODES:
				return joinNodes != null && !joinNodes.isEmpty();
			case ActivitydiagramPackage.ACTIVITY_DIAGRAM__DECISION_NODES:
				return decisionNodes != null && !decisionNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActivityDiagramImpl
