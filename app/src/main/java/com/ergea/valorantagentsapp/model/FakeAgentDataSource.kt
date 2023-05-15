package com.ergea.valorantagentsapp.model

import com.ergea.valorantagentsapp.R

/**
 * @Author: ridhogymnastiar
 * Github: https://github.com/ridhogaa
 */

object FakeAgentDataSource {
    val dummyAgents = listOf(
        Agent(
            1,
            R.drawable.fade,
            "Fade",
            "Initiator",
            "Turkish bounty hunter Fade unleashes the power of raw nightmare to seize enemy secrets. Attuned with terror itself, she hunts down targets and reveals their deepest fears - before crushing them in the dark.",
            "Seize",
            "EQUIP a knot of raw fear. FIRE to throw. The knot drops down after a set time. RE-USE to drop the knot early. The knot ruptures on impact, holding nearby enemies in place. Held enemies are Deafened, and Decayed.",
            "Haunt",
            "EQUIP a haunting watcher. FIRE to throw. The watcher drops down after a set time. RE-USE to drop the watcher early. The watcher lashes out on impact, Revealing enemies in its line of sight and creating terror trails to them. Enemies can destroy the watcher.",
            "Prowler",
            "EQUIP a prowler. FIRE to send the prowler forward. HOLD FIRE to steer the prowler towards your crosshair. The prowler will chase down the first enemy or terror trail it sees, and Nearsight the enemy on impact.",
            "Nightfall",
            "EQUIP the power of nightmare itself. FIRE to unleash a wave of unstoppable nightmare energy. Enemies caught in the wave are Marked by terror trails, Deafened, and Decayed."
        ),
        Agent(
            2,
            R.drawable.sova,
            "Sova",
            "Initiator",
            "Born from the eternal winter of Russia's tundra, Sova tracks, finds, and eliminates enemies with ruthless efficiency and precision. His custom bow and incredible scouting abilities ensure that even if you run, you cannot hide.",
            "Shock Bolt",
            "EQUIP a bow with a shock bolt. FIRE to send the explosive bolt forward, detonating upon collision and damaging players nearby. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.",
            "Recon Bolt",
            "EQUIP a bow with recon bolt. FIRE to send the recon bolt forward, activating upon collision and Revealing the location of nearby enemies caught in the line of sight of the bolt. Enemies can destroy this bolt. HOLD FIRE to extend the range of the projectile. ALTERNATE FIRE to add up to two bounces to this arrow.",
            "Owl Drone",
            "EQUIP an owl drone. FIRE to deploy and take control of movement of the drone. While in control of the drone, FIRE to shoot a marking dart. This dart will Reveal the location of any player struck by the dart.",
            "Hunter's Fury",
            "EQUIP a bow with three long-range, wall-piercing energy blasts. FIRE to release an energy blast in a line in front of Sova, dealing damage and Revealing the location of enemies caught in the line. This ability can be RE-USED up to two more times while the ability timer is active."
        ),
        Agent(
            3,
            R.drawable.reyna,
            "Reyna",
            "Duelist",
            "Forged in the heart of Mexico, Reyna dominates single combat, popping off with each kill she scores. Her capability is only limited by her raw skill, making her sharply dependant on performance.",
            "Devour",
            "Soul Harvest: Enemies that die to Reyna, or die within 3 seconds of taking damage from Reyna, leave behind Soul Orbs that last 3 seconds.\\r\\nDevour: INSTANTLY consume a nearby soul orb, rapidly Healing for a short duration. Health gained through this skill exceeding 100 will decay over time. If EMPRESS is active, this skill will automatically cast and not consume the Soul Orb.",
            "Dismiss",
            "INSTANTLY consume a nearby Soul Orb, becoming Intangible for a short duration. If EMPRESS is active, also become Invisible.",
            "Leer",
            "EQUIP an ethereal, destructible eye. ACTIVATE to cast the eye a short distance forward. The eye will Nearsight all enemies who look at it.",
            "Empress",
            "INSTANTLY enter a frenzy, gaining a Combat Stim that increases firing, equip and reload speed dramatically. Gain infinite charges of Soul Harvest abilities. When an enemy dies to Reyna, or dies within 3 seconds of taking damage from Reyna, the duration is renewed."
        ),
        Agent(
            4,
            R.drawable.raze,
            "Raze",
            "Duelist",
            "Raze explodes out of Brazil with her big personality and big guns. With her blunt-force-trauma playstyle, she excels at flushing entrenched enemies and clearing tight spaces with a generous dose of \\\"boom\\\".",
            "Blast Pack",
            "INSTANTLY throw a Blast Pack that will stick to surfaces. RE-USE the ability after deployment to detonate, damaging and moving anything hit.",
            "Paint Shells",
            "EQUIP a cluster grenade. FIRE to throw the grenade, which does damage and creates sub-munitions, each doing damage to anyone in their range. ALT FIRE to lob.",
            "Boom Bot",
            "EQUIP a Boom Bot. FIRE will deploy the bot, causing it to travel in a straight line on the ground, bouncing off walls. The Boom Bot will lock on to any enemies in its frontal cone and chase them, exploding for heavy damage if it reaches them.",
            "Showstopper",
            "EQUIP a rocket launcher. FIRE shoots a rocket that does massive area damage on contact with anything."
        ),
        Agent(
            5,
            R.drawable.sage,
            "Sage",
            "Sentinel",
            "The bastion of China, Sage creates safety for herself and her team wherever she goes. Able to revive fallen friends and stave off forceful assaults, she provides a calm center to a hellish battlefield.",
            "Slow Orb",
            "EQUIP a slowing orb. FIRE to throw a slowing orb forward that detonates upon landing, creating a lingering field that Slows players caught inside of it.",
            "Healing Orb",
            "EQUIP a healing orb. FIRE with your crosshairs over a damaged ally to activate a Heal-Over-Time on them. ALT FIRE while Sage is damaged to activate a self Heal-Over-Time.",
            "Barrier Orb",
            "EQUIP a barrier orb. FIRE places a wall that fortifies after a few seconds. ALT FIRE rotates the targeter.",
            "Resurrection",
            "EQUIP a resurrection ability. FIRE with your crosshairs placed over a dead ally to begin resurrecting them. After a brief channel, the ally will be brought back to life with full health."
        ),
        Agent(
            6,
            R.drawable.jett,
            "Jett",
            "Duelist",
            "Representing her home country of South Korea, Jett's agile and evasive fighting style lets her take risks no one else can. She runs circles around every skirmish, cutting enemies up before they even know what hit them.",
            "Updraft",
            "INSTANTLY propel Jett high into the air.",
            "Tailwind",
            "ACTIVATE to prepare a gust of wind for a limited time. RE-USE the wind to propel Jett in the direction she is moving. If Jett is standing still, she propels forward.",
            "Cloudburst",
            "INSTANTLY throw a projectile that expands into a brief vision-blocking cloud on impact with a surface. HOLD the ability key to curve the smoke in the direction of your crosshair.",
            "Blade Storm",
            "EQUIP a set of highly accurate throwing knives. FIRE to throw a single knife and recharge knives on a kill. ALTERNATE FIRE to throw all remaining daggers but does not recharge on a kill."
        ),
        Agent(
            7,
            R.drawable.astra,
            "Astra",
            "Controller",
            "Ghanaian Agent Astra harnesses the energies of the cosmos to reshape battlefields to her whim. With full command of her astral form and a talent for deep strategic foresight, she's always eons ahead of her enemy's next move.",
            "Nova Pulse",
            "Place Stars in Astral Form (Ultimate Key).\\r\\n\\r\\nACTIVATE a Star to detonate a Nova Pulse. The Nova Pulse charges briefly then strikes, Concussing all players in its area.",
            "Nebula/Dissipate",
            "Place Stars in Astral Form (Ultimate Key). \\r\\n\\r\\nACTIVATE a Star to transform it into a Nebula (smoke).\\r\\n\\r\\nUSE a Star to Dissipate it, returning the star to be placed in a new location after a delay.\\r\\n\\r\\nDissipate briefly forms a fake Nebula at the Star's location before returning.",
            "Gravity Well",
            "Place Stars in Astral Form (Ultimate Key).\\r\\n\\r\\nACTIVATE a Star to form a Gravity Well. Players in the area are pulled toward the center before it explodes, making all players still trapped inside Vulnerable.",
            "Astral Form/Cosmic Divide",
            "ACTIVATE to enter Astral Form where you can place Stars with PRIMARY FIRE. Stars can be reactivated later, transforming them into a Nova Pulse, Nebula, or Gravity Well.\\r\\n\\r\\nWhen Cosmic Divide is charged, use SECONDARY FIRE in Astral Form to begin aiming it, then PRIMARY FIRE to select two locations. An infinite Cosmic Divide connects the two points you select. Cosmic Divide blocks bullets and heavily dampens audio."
        ),
        Agent(
            8,
            R.drawable.yoru,
            "Yoru",
            "Duelist",
            "Japanese native Yoru rips holes straight through reality to infiltrate enemy lines unseen. Using deception and aggression in equal measure, he gets the drop on each target before they know where to look.",
            "FAKEOUT",
            "EQUIP an echo that transforms into a mirror image of Yoru when activated. FIRE to instantly activate the mirror image and send it forward. ALT FIRE to place an inactive echo. USE to transform an inactive echo into a mirror image and send it forward.  Mirror images explode in a Blinding flash when destroyed by enemies.",
            "BLINDSIDE",
            "EQUIP to rip an unstable dimensional fragment from reality. FIRE to throw the fragment, activating a flash that winds up once it collides with a hard surface in world.",
            "GATECRASH",
            "EQUIP a rift tether FIRE to send the tether forward ALT FIRE to place a stationary tether ACTIVATE to teleport to the tether's location USE to trigger a fake teleport.",
            "DIMENSIONAL DRIFT",
            "EQUIP a mask that can see between dimensions. FIRE to drift into Yoru's dimension, unable to be affected or seen by enemies from the outside."
        ),
        Agent(
            9,
            R.drawable.chamber,
            "Chamber",
            "Sentinel",
            "Well dressed and well armed, French weapons designer Chamber expels aggressors with deadly precision. He leverages his custom arsenal to hold the line and pick off enemies from afar, with a contingency built for every plan.",
            "Rendezvous",
            "PLACE a teleport anchor. While on the ground and in range of the anchor, REACTIVATE to quickly teleport to the anchor.  The anchor can be picked up to be REDEPLOYED.",
            "Trademark",
            "PLACE a trap that scans for enemies. When a visible enemy comes in range, the trap counts down and then destabilizes the terrain around them, creating a lingering field that Slows players caught inside of it. The trap can be picked up to be REDEPLOYED.",
            "Headhunter",
            "ACTIVATE to equip a heavy pistol. ALT FIRE with the pistol equipped to aim down sights.",
            "Tour De Force",
            "ACTIVATE to summon a powerful, custom sniper rifle that will kill an enemy with any direct hit to the upper body.  Killing an enemy creates a lingering field that Slows players caught inside of it."
        ),
        Agent(
            10,
            R.drawable.omen,
            "Omen",
            "Controller",
            "A phantom of a memory, Omen hunts in the shadows. He renders enemies blind, teleports across the field, then lets paranoia take hold as his foe scrambles to uncover where he might strike next.",
            "Paranoia",
            "EQUIP a blinding orb.  FIRE to throw it forward, briefly Nearsighting and Deafening all players it touches. This projectile can pass straight through walls.",
            "Dark Cover",
            "EQUIP a shadow orb, entering a phased world to place and target the orbs. PRESS the ability key to throw the shadow orb to the marked location, creating a long-lasting shadow sphere that blocks vision. HOLD FIRE while targeting to move the marker further away. HOLD SECONDARY FIRE while targeting to move the marker closer. PRESS RELOAD to toggle normal targeting view.",
            "Shrouded Step",
            "EQUIP a shrouded step ability and see its range indicator. FIRE to begin a brief channel, then teleport to the marked location.",
            "From the Shadows",
            "EQUIP a tactical map. FIRE to begin teleporting to the selected location. While teleporting, Omen will appear as a Shade that can be destroyed by an enemy to cancel his teleport, or PRESS EQUIP for Omen to cancel his teleport."
        )
    )
}