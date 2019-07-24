class UserProfile {
    static int id_counter;
    int id; // ユニークID
    int[] friends = new int[9999]; // 良くないスタイル
    int numFriends;
    Image[] embarrassingPhotos = new Image[9999];

    UserProfile() { // コンストラクタ 
        synchronized(this){
            id = id_counter++;
            numFriends = 0;
        }
    }

    synchronized void makeFriends(UserProfile newFriend) {  // 友達を受けとって加える
       synchronized(newFriend) {
          if(numFriends == friends.length
                || newFriend.numFriends == newFriend.friends.length)
             throw new TooManyFriendsException();
          friends[numFriends++] = newFriend.id;
          newFriend.friends[newFriend.numFriends++] = id;
       }
    }

    synchronized void removeFriend(UserProfile frenemy) {
       ...
    }
    ...
 }