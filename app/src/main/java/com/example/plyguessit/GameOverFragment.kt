package com.example.plyguessit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.plyguessit.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            // Inflate the layout for this fragment
            val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_over, container, false)
            binding.tryAgainButton.setOnClickListener { view: View ->
                view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
            }

            return binding.root
        }
    }
//actionGameOverFragmentToGameFragment

