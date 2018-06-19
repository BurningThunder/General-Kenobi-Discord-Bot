package discord.bot.HelloThere;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.entities.VoiceChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter
{
    public static void main( String[] args ) throws Exception
    {
     JDA jda = new JDABuilder(AccountType.BOT).setToken(Ref.token).buildBlocking();
     jda.addEventListener(new App());
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent evt)
    {
    	//Objects
    	User objUser = evt.getAuthor();
    	MessageChannel objMsgCh = evt.getChannel();
    	Message objMsg = evt.getMessage();
    	
    	
    	//Commands
    	if (objMsg.getContentRaw().charAt(0) == '>') {
    		String[] strArgs = objMsg.getContentRaw().substring(1).split(" ");
    			//Displays "Ah, General Kenobi!"
    		if (strArgs[0].equals("hellothere")) {
    			objMsgCh.sendMessage("Ah, General Kenobi!").queue();
    			//Displays a tragedy
    		}else if (strArgs[0].equals("tragedy")) {
    			objMsgCh.sendMessage("Did you ever hear the tragedy of Darth Plagueis The Wise? I thought not. It's not a story the Jedi would tell you. It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life… He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. The dark side of the Force is a pathway to many abilities some consider to be unnatural. He became so powerful… the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. Ironic. He could save others from death, but not himself.").queue();
    			//Displays the high ground
    		}else if (strArgs[0].equals("highground")) {
    			objMsgCh.sendMessage("It's over Anakin! I have the high ground!").queue();
    			//Displays Where the fun begins
    		}else if (strArgs[0].equals("fun")) {
    			objMsgCh.sendMessage("This is where the fun begins!").queue();
    			//Displays why spinning is a good trick
    		}else if (strArgs[0].equals("trick")) {
    			objMsgCh.sendMessage("Try spinning! That's a good trick!").queue();
    			//Rolls a dice
    		}else if (strArgs[0].equals("roll")){
    			int intSides = 6;
    			if(strArgs.length > 1) {
    				intSides = Integer.valueOf(strArgs[1]);
    			}
    			objMsgCh.sendMessage("You rolled a " + (int)(Math.random() * intSides + 1)).queue();
    			//Displays A happy landing
    		}else if (strArgs[0].equals("landing")) {
    			objMsgCh.sendMessage("https://i.redd.it/zx1v45g104iy.png").queue();
    			//Displays the list of Commands for the bot
    		}else if (strArgs[0].equals("commands")) {
    			objMsgCh.sendMessage("```Command List```\r\n" + 
    					"***Command Prefix: >***\r\n" + 
    					"**1. hellothere**\r\n" + 
    					"**2. tragedy**\r\n" + 
    					"**3. highground**\r\n" + 
    					"**4. fun**\r\n" + 
    					"**5. trick**\r\n" + 
    					"**6. roll - Rolls a dice. Example: >roll 6**\r\n" + 
    					"**7. landing**\r\n" + 
    					"**8. commands - displays a list of commands**\r\n" + 
    					"**9. god - Shows image of God**\r\n" + 
    					"**10. duelofthefates - Shows one of the best fights in Star Wars!**\r\n" + 
    					"**11. yep - Yep!**\r\n" + 
    					"**12. archives - The archives must be incomplete**\r\n" + 
    					"**13. politics - That business with politics it didn't....it didn't happen.**\r\n" + 
    					"**14. gettingoutofhand - There are two of them!**\r\n" + 
    					"**15. surprise - It's a welcome one**\r\n"+ 
    					"**16. doit - It's not the Jedi way!**\r\n" + 
    					"**17. treason - I am the Senate!**\r\n" + 
    					"```This bot's commands are subject to change```").queue();
    			//Displays an image of God
    		}else if (strArgs[0].equals("god")) {
    			objMsgCh.sendMessage("https://brightcove04pmdo-a.akamaihd.net/3653334524001/3653334524001_5709285439001_5709275707001-vs.jpg?pubId=3653334524001&videoId=5709275707001").queue();
    				//Links a video to the Duel of Fates
    		}else if (strArgs[0].equals("duelofthefates")) {
    			objMsgCh.sendMessage("https://www.youtube.com/watch?v=SKlLMRuOx10").queue();
    			//Displays Yep!
    		}else if (strArgs[0].equals("yep")) {
    			objMsgCh.sendMessage("http://i.imgur.com/jteMw25.jpg").queue();
    			//Displays the incomplete archives
    		}else if (strArgs[0].equals("archives")) {
    			objMsgCh.sendMessage("http://i0.kym-cdn.com/entries/icons/original/000/023/967/obiwan.jpg").queue();
    			//Displays The dangers of politics
    		}else if (strArgs[0].equals("politics")) {
    			objMsgCh.sendMessage("https://pa1.narvii.com/6836/00e69c65f7549108c7b4bfecf28513b9fe69f203_00.gif").queue();
    			//Displays the two of them
    		}else if (strArgs[0].equals("gettingoutofhand")) {
    			objMsgCh.sendMessage("https://i.imgflip.com/1yyrdh.jpg").queue();
    			//Displays A surprise 
    		}else if (strArgs[0].equals("surprise")) {
    			objMsgCh.sendMessage("https://i.redd.it/3ah6k9okldoy.jpg").queue();
    			//Displays Why it's not the Jedi way
    		}else if(strArgs[0].equals("doit")) {
    			objMsgCh.sendMessage("http://78.media.tumblr.com/tumblr_m7e67rVjIc1qe2rrbo1_r1_500.gif").queue();
    			//Displays The Senate in gif format
    		}else if(strArgs[0].equals("treason")) {
    			objMsgCh.sendMessage("http://31.media.tumblr.com/tumblr_lr34vyz9cs1r2v6tdo1_500.gif\r\n" + 
    					"https://media1.tenor.com/images/3e8f2f0a5a953953c3cc6c032c2645bc/tenor.gif?itemid=10814387\r\n" + 
    					"https://i.gifer.com/2LYM.gif\r\n" +
    					"https://media1.giphy.com/media/eAqriEkesYNBC/giphy.gif\r\n" +
    					"https://media1.tenor.com/images/8004bda2bbf5b8fa2c6bf0faa4475e04/tenor.gif?itemid=9797353\r\n" +
    					"https://media.giphy.com/media/EFA3BKxiNpENW/source.gif\r\n" +
    					"http://gifimage.net/wp-content/uploads/2017/11/its-treason-then-gif-1.gif").queue();
    		}
    	
    	}
    }
}
