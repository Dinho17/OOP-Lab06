package it.unibo.oop.lab.collections2;

import java.util.*;


/**
 * 
 * Instructions
 * 
 * This will be an implementation of
 * {@link it.unibo.oop.lab.collections2.SocialNetworkUser}:
 * 
 * 1) complete the definition of the methods by following the suggestions
 * included in the comments below.
 * 
 * @param <U>
 *            Specific user type
 */
public final class SocialNetworkUserImpl<U extends User> extends UserImpl implements SocialNetworkUser<U> {

	
	private Map<String, List<String>> followed;
    /*
     * 
     * [FIELDS]
     * 
     * Define any necessary field
     * 
     * In order to save the people followed by a user organized in groups, adopt
     * a generic-type Map:
     * 
     * think of what type of keys and values would best suit the requirements
     */

    /*
     * [CONSTRUCTORS]
     * 
     * 1) Complete the definition of the constructor below, for building a user
     * participating in a social network, with 4 parameters, initializing:
     * 
     * - firstName - lastName - username - age and every other necessary field
     * 
     * 2) Define a further constructor where age is defaulted to -1
     */

    /**
     * Builds a new {@link SocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.followed = new HashMap<String, List<String>>();
    }

    public SocialNetworkUserImpl(final String name, final String surname, final String user) {
        super(name, surname, user, -1);
        this.followed = new HashMap<String, List<String>>();
    }
    
    /*
     * [METHODS]
     * 
     * Implements the methods below
     */


    @Override
    public Collection<U> getFollowedUsersInGroup(final String groupName) {
        return null;
    }

    @Override
    public List<U> getFollowedUsers() {
        return null;
    }

    private boolean existGroups(String username) {
    	if (this.followed.get(username) == null) {
    		return false;
    	} else {
    		return true;
    	}
    }

	@Override
	public boolean addFollowedUser(String group, U user) {
		if (this.followed.containsKey(super.getUsername())) {
			if (!this.existGroups(super.getUsername())) {
				this.followed.put(user.getUsername(), new ArrayList<String>());
			}
			List<String> list = this.followed.get(super.getUsername());
			list.add(group);
			return true;
		}
		return false;
	}
    
}
