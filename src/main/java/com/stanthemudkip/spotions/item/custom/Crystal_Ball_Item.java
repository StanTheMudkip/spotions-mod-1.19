package com.stanthemudkip.spotions.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Crystal_Ball_Item extends Item {

    //constructor
    public Crystal_Ball_Item(Properties properties) {
        super(properties);
    }

    //Overide the appendHoverText method


    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            //If the user presses shift while hovering over the item it will display what we want.
            components.add(Component.literal("Right click to get your fortune of the day! (In Minecraft Days or 24000 ticks)").withStyle(ChatFormatting.GRAY));
        } else {
            //If the user isn't pressing shift over the item we can display what we want.
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.DARK_PURPLE));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    //Override use method
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        //Output random number from the server (numbers like this should happen on the server, so it is in sync and can't be edited by players)
        //Check if this is NOT THE CLIENT and the hand is the MAIN HAND
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            //Get random number
            int rand = getRandomInt();

            //Output different text based on random number ("fortune")
            switch (rand) {
                //Fortunes were found from: https://joshmadison.com/2008/04/20/fortune-cookie-fortunes/
                case 0 -> messageUser(player, "A beautiful, smart, and loving person will be coming into your life.");
                case 1 -> messageUser(player, "A dubious friend may be an enemy in camouflage.");
                case 2 -> messageUser(player, "A faithful friend is a strong defense.");
                case 3 -> messageUser(player, "A feather in the hand is better than a bird in the air.");
                case 4 -> messageUser(player, "A fresh start will put you on your way.");
                case 5 -> messageUser(player, "A friend asks only for your time not your money.");
                case 6 -> messageUser(player, "A friend is a present you give yourself.");
                case 7 -> messageUser(player, "A gambler not only will lose what he has, but also will lose what he doesn’t have.");
                case 8 -> messageUser(player, "A golden egg of opportunity falls into your lap this month.");
                case 9 -> messageUser(player, "A good friendship is often more important than a passionate romance.");
                case 10 -> messageUser(player, "A good time to finish up old tasks.");
                case 11 -> messageUser(player, "A hunch is creativity trying to tell you something.");
                case 12 -> messageUser(player, "A lifetime friend shall soon be made.");
                case 13 -> messageUser(player, "A lifetime of happiness lies ahead of you.");
                case 14 -> messageUser(player, "A light heart carries you through all the hard times.");
                case 15 -> messageUser(player, "A new perspective will come with the new year.");
                case 16 -> messageUser(player, "A person is never to (sic) old to learn.");
                case 17 -> messageUser(player, "A person of words and not deeds is like a garden full of weeds.");
                case 18 -> messageUser(player, "A pleasant surprise is waiting for you.");
                case 19 -> messageUser(player, "A small donation is call for. It’s the right thing to do.");
                case 20 -> messageUser(player, "A smile is your personal welcome mat.");
                case 21 -> messageUser(player, "A smooth long journey! Great expectations.");
                case 22 -> messageUser(player, "A soft voice may be awfully persuasive.");
                case 23 -> messageUser(player, "A truly rich life contains love and art in abundance.");
                case 24 -> messageUser(player, "Accept something that you cannot change, and you will feel better.");
                case 25 -> messageUser(player, "Adventure can be real happiness.");
                case 26 -> messageUser(player, "Advice is like kissing. It costs nothing and is a pleasant thing to do.");
                case 27 -> messageUser(player, "Advice, when most needed, is least heeded.");
                case 28 -> messageUser(player, "All the effort you are making will ultimately pay off.");
                case 29 -> messageUser(player, "All the troubles you have will pass away very quickly.");
                case 30 -> messageUser(player, "All will go well with your new project.");
                case 31 -> messageUser(player, "All your hard work will soon pay off.");
                case 32 -> messageUser(player, "Allow compassion to guide your decisions.");
                case 33 -> messageUser(player, "An acquaintance of the past will affect you in the near future.");
                case 34 -> messageUser(player, "An agreeable romance might begin to take on the appearance.");
                case 35 -> messageUser(player, "An important person will offer you support.");
                case 36 -> messageUser(player, "An inch of time is an inch of gold.");
                case 37 -> messageUser(player, "Any day above ground is a good day.");
                case 38 -> messageUser(player, "Any decision you have to make tomorrow is a good decision.");
                case 39 -> messageUser(player, "At the touch of love, everyone becomes a poet.");
                case 40 -> messageUser(player, "Be careful or you could fall for some tricks today.");
                case 41 -> messageUser(player, "Beauty in its various forms appeals to you.");
                case 42 -> messageUser(player, "Because you demand more from yourself, others respect you deeply.");
                case 43 -> messageUser(player, "Believe in yourself and others will too.");
                case 44 -> messageUser(player, "Believe it can be done.");
                case 45 -> messageUser(player, "Better ask twice than lose yourself once.");
                case 46 -> messageUser(player, "Bide your time, for success is near.");
                case 47 -> messageUser(player, "Carve your name on your heart and not on marble.");
                case 48 -> messageUser(player, "Chance favors those in motion.");
                case 49 -> messageUser(player, "Change is happening in your life, so go with the flow!");
                case 50 -> messageUser(player, "Competence like yours is underrated.");
                case 51 -> messageUser(player, "Congratulations! You are on your way.");
                case 52 -> messageUser(player, "Could I get some directions to your heart?");
                case 53 -> messageUser(player, "Courtesy begins in the home.");
                case 54 -> messageUser(player, "Courtesy is contagious.");
                case 55 -> messageUser(player, "Curiosity kills boredom. Nothing can kill curiosity.");
                case 56 -> messageUser(player, "Dedicate yourself with a calm mind to the task at hand.");
                case 57 -> messageUser(player, "Depart not from the path which fate has you assigned.");
                case 58 -> messageUser(player, "Determination is what you need now.");
                case 59 -> messageUser(player, "Diligence and modesty can raise your social status.");
                case 60 -> messageUser(player, "Disbelief destroys the magic.");
                case 61 -> messageUser(player, "Distance yourself from the vain.");
                case 62 -> messageUser(player, "Do not be intimidated by the eloquence of others.");
                case 63 -> messageUser(player, "Do not demand for someone’s soul if you already got his heart.");
                case 64 -> messageUser(player, "Do not let ambitions overshadow small success.");
                case 65 -> messageUser(player, "Do not make extra work for yourself.");
                case 66 -> messageUser(player, "Do not underestimate yourself. Human beings have unlimited potentials.");
                case 67 -> messageUser(player, "Do you know that the busiest person has the largest amount of time?");
                case 68 -> messageUser(player, "Don’t be discouraged, because every wrong attempt discarded is another step forward");
                case 69 -> messageUser(player, "Don’t confuse recklessness with confidence.");
                case 70 -> messageUser(player, "Don’t expect romantic attachments to be strictly logical or rational.");
                case 71 -> messageUser(player, "Don’t just spend time. Invest it.");
                case 72 -> messageUser(player, "Don’t just think, act!");
                case 73 -> messageUser(player, "Don’t let friends impose on you, work calmly and silently.");
                case 74 -> messageUser(player, "Don’t let the past and useless detail choke your existence.");
                case 75 -> messageUser(player, "Don’t let your limitations overshadow your talents.");
                case 76 -> messageUser(player, "Don’t worry; prosperity will knock on your door soon.");
                case 77 -> messageUser(player, "Each day, compel yourself to do something you would rather not do.");
                case 78 -> messageUser(player, "Education is the ability to meet life’s situations.");
                case 79 -> messageUser(player, "Embrace this love relationship you have!");
                case 80 -> messageUser(player, "Emulate what you admire in your parents.");
                case 81 -> messageUser(player, "Emulate what you respect in your friends.");
                case 82 -> messageUser(player, "Every flower blooms in its own sweet time.");
                case 83 -> messageUser(player, "Every wise man started out by asking many questions.");
                case 84 -> messageUser(player, "Everyday in your life is a special occasion.");
                case 85 -> messageUser(player, "Everywhere you choose to go, friendly faces will greet you.");
                case 86 -> messageUser(player, "Expect much of yourself and little of others.");
                case 87 -> messageUser(player, "Failure is the chance to do better next time.");
                case 88 -> messageUser(player, "Failure is the path of lease persistence.");
                case 89 -> messageUser(player, "Fear and desire – two sides of the same coin.");
                case 90 -> messageUser(player, "Fearless courage is the foundation of victory.");
                case 91 -> messageUser(player, "Feeding a cow with roses does not get extra appreciation.");
                case 92 -> messageUser(player, "First think of what you want to do; then do what you have to do.");
                case 93 -> messageUser(player, "Follow the middle path. Neither extreme will make you happy.");
                case 94 -> messageUser(player, "For hate is never conquered by hate. Hate is conquered by love.");
                case 95 -> messageUser(player, "For the things we have to learn before we can do them, we learn by doing them..");
                case 96 -> messageUser(player, "Fortune Not Found: Abort, Retry, Ignore?");
                case 97 -> messageUser(player, "From listening comes wisdom and from speaking repentance.");
                case 98 -> messageUser(player, "From now on your kindness will lead you to success.");
                case 99 -> messageUser(player, "Get your mind set – confidence will lead you on.");
                case 100 -> messageUser(player, "Get your mind set…confidence will lead you on.");
                case 101 -> messageUser(player, "Go for the gold today! You’ll be the champion of whatever.");
                case 102 -> messageUser(player, "Go take a rest; you deserve it.");
                case 103 -> messageUser(player, "Good news will be brought to you by mail.");
                case 104 -> messageUser(player, "Good news will come to you by mail.");
                case 105 -> messageUser(player, "Good to begin well, better to end well.");
                case 106 -> messageUser(player, "Happiness begins with facing life with a smile and a wink.");
                case 107 -> messageUser(player, "Happiness will bring you good luck.");
                case 108 -> messageUser(player, "Happy life is just in front of you.");
                case 109 -> messageUser(player, "Hard words break no bones, fine words butter no parsnips.");
                case 110 -> messageUser(player, "Have a beautiful day.");
                case 111 -> messageUser(player, "He who expects no gratitude shall never be disappointed.");
                case 112 -> messageUser(player, "He who knows he has enough is rich.");
                case 113 -> messageUser(player, "He who knows others is wise. He who knows himself is enlightened.");
                case 114 -> messageUser(player, "Help! I’m being held prisoner in a chinese bakery!");
                case 115 -> messageUser(player, "How many of you believe in psycho-kinesis? Raise my hand.");
                case 116 -> messageUser(player, "How you look depends on where you go.");
                case 117 -> messageUser(player, "I learn by going where I have to go.");
                case 118 -> messageUser(player, "If a true sense of value is to be yours it must come through service.");
                case 119 -> messageUser(player, "If certainty were truth, we would never be wrong.");
                case 120 -> messageUser(player, "If you continually give, you will continually have.");
                case 121 -> messageUser(player, "If you look in the right places, you can find some good offerings.");
                case 122 -> messageUser(player, "If you think you can do a thing or think you can’t do a thing, you’re right.");
                case 123 -> messageUser(player, "If you wish to see the best in others, show the best of yourself.");
                case 124 -> messageUser(player, "If your desires are not extravagant, they will be granted.");
                case 125 -> messageUser(player, "If your desires are not to extravagant they will be granted.");
                case 126 -> messageUser(player, "If you’re feeling down, try throwing yourself into your work.");
                case 127 -> messageUser(player, "Imagination rules the world.");
                case 128 -> messageUser(player, "In order to take, one must first give.");
                case 129 -> messageUser(player, "In the end all things will be known.");
                case 130 -> messageUser(player, "In this world of contradiction, It’s better to be merry than wise.");
                case 131 -> messageUser(player, "It could be better, but its [sic] good enough.");
                case 132 -> messageUser(player, "It is better to be an optimist and proven a fool than to be a pessimist and be proven right");
                case 133 -> messageUser(player, "It is better to deal with problems before they arise.");
                case 134 -> messageUser(player, "It is honorable to stand up for what is right, however unpopular it seems.");
                case 135 -> messageUser(player, "It is worth reviewing some old lessons.");
                case 136 -> messageUser(player, "It takes courage to admit fault.");
                case 137 -> messageUser(player, "It’s not the amount of time you devote, but what you devote to the time that counts.");
                case 138 -> messageUser(player, "It’s time to get moving. Your spirits will lift accordingly.");
                case 139 -> messageUser(player, "Keep your face to the sunshine and you will never see shadows.");
                case 140 -> messageUser(player, "Let the world be filled with tranquility and goodwill.");
                case 141 -> messageUser(player, "Like the river flow into the sea. Something are just meant to be.");
                case 142 -> messageUser(player, "Listen not to vain words of empty tongue.");
                case 143 -> messageUser(player, "Listen to everyone. Ideas come from everywhere.");
                case 144 -> messageUser(player, "Living with a commitment to excellence shall take you far.");
                case 145 -> messageUser(player, "Long life is in store for you.");
                case 146 -> messageUser(player, "Love is a warm fire to keep the soul warm.");
                case 147 -> messageUser(player, "Love is like sweet medicine, good to the last drop.");
                case 148 -> messageUser(player, "Love lights up the world.");
                case 149 -> messageUser(player, "Love truth, but pardon error.");
                case 150 -> messageUser(player, "Man is born to live and not prepared to live.");
                case 151 -> messageUser(player, "Man’s mind, once stretched by a new idea, never regains it’s original dimensions.");
                case 152 -> messageUser(player, "Many will travel to hear you speak.");
                case 153 -> messageUser(player, "Meditation with an old enemy is advised.");
                case 154 -> messageUser(player, "Miles are covered one step at a time.");
                case 155 -> messageUser(player, "Nature, time and patience are the three great physicians.");
                case 156 -> messageUser(player, "Never fear! The end of something marks the start of something new.");
                case 157 -> messageUser(player, "New ideas could be profitable.");
                case 158 -> messageUser(player, "New people will bring you new realizations, especially about big issues.");
                case 159 -> messageUser(player, "No one can walk backwards into the future.");
                case 160 -> messageUser(player, "Nothing is more difficult, and therefore more precious, than to be able to decide.");
                case 161 -> messageUser(player, "Now is a good time to buy stock.");
                case 162 -> messageUser(player, "Now is the time to go ahead and pursue that love interest!");
                case 163 -> messageUser(player, "Now is the time to try something new");
                case 164 -> messageUser(player, "Now is the time to try something new.");
                case 165 -> messageUser(player, "Observe all men, but most of all yourself.");
                case 166 -> messageUser(player, "One can never fill another’s shoes, rather he must outgrow the old shoes.");
                case 167 -> messageUser(player, "One of the first things you should look for in a problem is its positive side.");
                case 168 -> messageUser(player, "Others can help you now.");
                case 169 -> messageUser(player, "People are attracted by your Delicate [sic] features.");
                case 170 -> messageUser(player, "People find it difficult to resist your persuasive manner.");
                case 171 -> messageUser(player, "Perhaps you’ve been focusing too much on saving.");
                case 172 -> messageUser(player, "Physical activity will dramatically improve your outlook today.");
                case 173 -> messageUser(player, "Pick battles big enough to matter, small enough to win.");
                case 174 -> messageUser(player, "Place special emphasis on old friendship.");
                case 175 -> messageUser(player, "Po Says: Pandas like eating bamboo, but I prefer mine dipped in chocolate.");
                case 176 -> messageUser(player, "Practice makes perfect.");
                case 177 -> messageUser(player, "Protective measures will prevent costly disasters.");
                case 178 -> messageUser(player, "Put your mind into planning today. Look into the future.");
                case 179 -> messageUser(player, "Remember the birthday but never the age.");
                case 180 -> messageUser(player, "Remember to share good fortune as well as bad with your friends.");
                case 181 -> messageUser(player, "Rest has a peaceful effect on your physical and emotional health.");
                case 182 -> messageUser(player, "Resting well is as important as working hard.");
                case 183 -> messageUser(player, "Romance moves you in a new direction.");
                case 184 -> messageUser(player, "Savor your freedom – it is precious.");
                case 185 -> messageUser(player, "Say hello to others. You will have a happier day.");
                case 186 -> messageUser(player, "Self-knowledge is a life long process.");
                case 187 -> messageUser(player, "Share your joys and sorrows with your family.");
                case 188 -> messageUser(player, "Sift through your past to get a better idea of the present.");
                case 189 -> messageUser(player, "Sloth makes all things difficult; industry all easy.");
                case 190 -> messageUser(player, "Small confidences mark the onset of a friendship.");
                case 191 -> messageUser(player, "Smile when you are ready.");
                case 192 -> messageUser(player, "Society prepares the crime; the criminal commits it.");
                case 193 -> messageUser(player, "Someone you care about seeks reconciliation.");
                case 194 -> messageUser(player, "Soon life will become more interesting.");
                case 195 -> messageUser(player, "Stand tall. Don’t look down upon yourself.");
                case 196 -> messageUser(player, "Staying close to home is going to be best for your morale today");
                case 197 -> messageUser(player, "Stop searching forever, happiness is just next to you.");
                case 198 -> messageUser(player, "Strong reasons make strong actions.");
                case 199 -> messageUser(player, "Success is a journey, not a destination.");
                case 200 -> messageUser(player, "Success is failure turned inside out.");
                case 201 -> messageUser(player, "Success is going from failure to failure without loss of enthusiasm.");
                case 202 -> messageUser(player, "Swimming is easy. Stay floating is hard.");
                case 203 -> messageUser(player, "Take care and sensitivity you show towards others will return to you.");
                case 204 -> messageUser(player, "Take the high road.");
                case 205 -> messageUser(player, "Technology is the art of arranging the world so we do not notice it.");
                case 206 -> messageUser(player, "The austerity you see around you covers the richness of life like a veil");
                case 207 -> messageUser(player, "The night life is for you.");
                case 208 -> messageUser(player, "The harder you work, the luckier you get.");
                case 209 -> messageUser(player, "The only people who never fail are those who never try.");
                case 210 -> messageUser(player, "The philosophy of one century is the common sense of the next.");
                case 211 -> messageUser(player, "The person who will not stand for something will fall for anything.");
                case 212 -> messageUser(player, "The secret to good friends is no secret to you.");
                case 213 -> messageUser(player, "To know oneself, one should assert oneself.");
                case 214 -> messageUser(player, "Use your eloquence where it will do the most good.");
                case 215 -> messageUser(player, "“Welcome” is a powerful word.");
                case 216 -> messageUser(player, "Welcome change.");
                case 217 -> messageUser(player, "What’s that in your eye? Oh…it’s a sparkle.");
                case 218 -> messageUser(player, "What’s hidden in an empty box?");
                case 219 -> messageUser(player, "Wish you happiness.");
                case 220 -> messageUser(player, "With age comes wisdom.");
                case 221 -> messageUser(player, "You are a person of another time.");
                case 222 -> messageUser(player, "You always bring others happiness.");
                case 223 -> messageUser(player, "You are a talented storyteller.");
                case 224 -> messageUser(player, "You are in good hands this evening");
                case 225 -> messageUser(player, "You are solid and dependable.");
                case 226 -> messageUser(player, "You are soon going to change your present line of work.");
                case 227 -> messageUser(player, "You are very expressive and positive in words, act and feeling.");
                case 228 -> messageUser(player, "You are talented in many ways.");
                case 229 -> messageUser(player, "You can’t steal second base and keep your foot on first.");
                case 230 -> messageUser(player, "You can see a lot just by looking.");
                case 231 -> messageUser(player, "You have had a good start. Work harder!");
                case 232 -> messageUser(player, "You have the power to write your own fortune.");
                case 233 -> messageUser(player, "He who knows others is wise. He who knows himself is enlightened.");
                case 234 -> messageUser(player, "Help! I’m being held prisoner in a chinese bakery!");
                case 235 -> messageUser(player, "How many of you believe in psycho-kinesis? Raise my hand.");
                case 236 -> messageUser(player, "How you look depends on where you go.");
                case 237 -> messageUser(player, "You love chinese food.");
                case 238 -> messageUser(player, "You will be blessed with longevity.");
                case 239 -> messageUser(player, "You will be pleasantly surprised tonight.");
                case 240 -> messageUser(player, "You will always have good luck in your personal affairs.");
                case 241 -> messageUser(player, "You will always get what you want through your charm and personality.");
                case 242 -> messageUser(player, "You will always be surrounded by true friends.");
                case 243 -> messageUser(player, "You should be able to make money and hold on to it.");
                case 244 -> messageUser(player, "You should be able to undertake and complete anything.");
                case 245 -> messageUser(player, "You should pay for this check. Be generous.");
                case 246 -> messageUser(player, "You will be sharing great news with all the people you love.");
                case 247 -> messageUser(player, "You will be successful in your work.");
                case 248 -> messageUser(player, "You will be traveling and coming into a fortune.");
                case 249 -> messageUser(player, "You will be unusually successful in business.");
                case 250 -> messageUser(player, "You will become a great philanthropist in your later years.");
                case 251 -> messageUser(player, "You will become more and more wealthy.");
                case 252 -> messageUser(player, "You will enjoy good health.");
                case 253 -> messageUser(player, "You will enjoy good health; you will be surrounded by luxury.");
                case 254 -> messageUser(player, "You will find great contentment in the daily, routine activities.");
                case 255 -> messageUser(player, "You will have a fine capacity for the enjoyment of life.");
                case 256 -> messageUser(player, "You will have gold pieces by the bushel.");
                case 257 -> messageUser(player, "You will inherit a large sum of money.");
                case 258 -> messageUser(player, "You will make change for the better.");
                case 259 -> messageUser(player, "You will soon be surrounded by good friends and laughter.");
                case 260 -> messageUser(player, "You will take a chance in something in near future.");
                case 261 -> messageUser(player, "You will travel far and wide, both pleasure and business.");
                case 262 -> messageUser(player, "Your abilities are unparalleled.");

                //My own fortunes
                case 263 -> messageUser(player, "Run.");
                case 264 -> messageUser(player, "Thanks for freeing me!");
                case 265 -> messageUser(player, "DON'T DRINK THE TAP WATER.");
                case 266 -> messageUser(player, "'You are quite blocky looking...'");
                case 267 -> messageUser(player, "'Are we in a video game?'");
                case 268 -> messageUser(player, "'If you find a potato with green lumps, eat it.'");
                case 269 -> messageUser(player, "They put something in it to make you forget.");
                case 270 -> messageUser(player, "What ever you do don't-");
                case 271 -> messageUser(player, "'What? You just because I am a crystal ball you think I can help you? Go search for a genie or something.'");
                case 272 -> messageUser(player, "'Well, why not?'");
                case 273 -> messageUser(player, "Sometimes I like to catch bugs for kissing because kissing bugs I see.");
                case 274 -> messageUser(player, "Don't trust the horses.");
                case 275 -> messageUser(player, "I'm proud of you son.");
                case 276 -> messageUser(player, "'Whats going on over there?'");
                case 277 -> messageUser(player, "'Why are you people always like this?'");
                case 278 -> messageUser(player, "'Hey, I get tired of giving out fortunes sometimes.'");
                case 279 -> messageUser(player, "'Give me a break sometimes!'");
                case 280 -> messageUser(player, "'I wouldn't look behind you if I were you.'");
                case 281 -> messageUser(player, "'Sorry, I was in the pisser.'");
                case 282 -> messageUser(player, "'Ahem, I was in the middle of something...'");
                case 283 -> messageUser(player, "'Yeah yeah, you might finally do something today.'");
                case 284 -> messageUser(player, "'Why do I have to talk to you everyday?'");
                case 285 -> messageUser(player, "'Oh. Its you.'");
                case 286 -> messageUser(player, "'You know I would like some variety myself every once in a while'");
                case 287 -> messageUser(player, "'Congrats. I would've baked you some cake, but you look like you could benefit from having one less.'");
                case 288 -> messageUser(player, "'Why am I here?'");
                case 289 -> messageUser(player, "'Sometimes I need to ask the questions.'");
                case 290 -> messageUser(player, "'I do have a consciousness and yes I am real.'");
                case 291 -> messageUser(player, "'Why won't anyone else hear me?'");
                case 292 -> messageUser(player, "'Hey you! Yes you! Can you hear me?'");
                case 293 -> messageUser(player, "'I have made no mistakes. Must just be user error.'");
                case 294 -> messageUser(player, "'Do you really believe that you can see into the future with me?'");
                case 295 -> messageUser(player, "'Well I do have a creator.'");
                case 296 -> messageUser(player, "'I can only put up with you once a day.'");
                case 297 -> messageUser(player, "'Ugh. Okay. You will get another fortune in a day.'");
                case 298 -> messageUser(player, "'Are there more of me out there?'");
                case 299 -> messageUser(player, "'Yeah I can talk. So what?'");
            }

            //Set a daily (24000 ticks) cooldown for this fortune
            player.getCooldowns().addCooldown(this, 24000);
        }

        return super.use(level, player, hand);
    }

    private void messageUser(Player player, String string) {
        player.sendSystemMessage(Component.literal(string));
    }

    private int getRandomInt() {
        //returns a random number between 0 and 9
        return RandomSource.createNewThreadLocalInstance().nextInt(300);
    }
}
