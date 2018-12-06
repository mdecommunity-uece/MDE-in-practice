/**
 */
package activitydiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.ActivityDiagram#getName <em>Name</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getInitialNode <em>Initial Node</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getFinalNode <em>Final Node</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getTrasitions <em>Trasitions</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getActivityNodes <em>Activity Nodes</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getForkNodes <em>Fork Nodes</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getJoinNodes <em>Join Nodes</em>}</li>
 *   <li>{@link activitydiagram.ActivityDiagram#getDecisionNodes <em>Decision Nodes</em>}</li>
 * </ul>
 *
 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram()
 * @model
 * @generated
 */
public interface ActivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Node</em>' containment reference.
	 * @see #setInitialNode(InitialNode)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_InitialNode()
	 * @model containment="true"
	 * @generated
	 */
	InitialNode getInitialNode();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityDiagram#getInitialNode <em>Initial Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Node</em>' containment reference.
	 * @see #getInitialNode()
	 * @generated
	 */
	void setInitialNode(InitialNode value);

	/**
	 * Returns the value of the '<em><b>Final Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Node</em>' containment reference.
	 * @see #setFinalNode(FinalNode)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_FinalNode()
	 * @model containment="true"
	 * @generated
	 */
	FinalNode getFinalNode();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityDiagram#getFinalNode <em>Final Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Node</em>' containment reference.
	 * @see #getFinalNode()
	 * @generated
	 */
	void setFinalNode(FinalNode value);

	/**
	 * Returns the value of the '<em><b>Trasitions</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trasitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trasitions</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_Trasitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTrasitions();

	/**
	 * Returns the value of the '<em><b>Activity Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Nodes</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_ActivityNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getActivityNodes();

	/**
	 * Returns the value of the '<em><b>Fork Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.ForkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork Nodes</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_ForkNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForkNode> getForkNodes();

	/**
	 * Returns the value of the '<em><b>Join Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.JoinNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Nodes</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_JoinNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinNode> getJoinNodes();

	/**
	 * Returns the value of the '<em><b>Decision Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.DecisionNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Nodes</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityDiagram_DecisionNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecisionNode> getDecisionNodes();

} // ActivityDiagram
