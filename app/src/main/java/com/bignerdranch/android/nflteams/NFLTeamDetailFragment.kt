package com.bignerdranch.android.nflteams

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.bignerdranch.android.nflteams.databinding.FragmentNflTeamDetailBinding
import java.util.UUID

class NFLTeamDetailFragment : Fragment() {
    private var _binding :FragmentNflTeamDetailBinding? = null
    private lateinit var nflteam : NFLTeam
    private val binding
        get() = checkNotNull(_binding){
            "Cannot access Binding because it is null"
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nflteam = NFLTeam (
        teamName = "Colts" ,
        logoFile = "colts.png",
        conference = "AFC" ,
        division = "AFC" ,
        stadium = "Lucas Oil Stadium" ,
        teamID = UUID.randomUUID() ,
        latitude = 20.22,
        longitude = 10.11
        )
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =
            FragmentNflTeamDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}