package com.sethchhim.kuboo_client.ui.reader.comic

import android.annotation.SuppressLint
import com.sethchhim.kuboo_client.Extensions.gone
import com.sethchhim.kuboo_client.data.model.GlideLocal

@SuppressLint("Registered")
open class ReaderComicActivityImpl1_Preview : ReaderComicActivityImpl0_View() {

    override fun loadLocalPreviewImage() {
        previewImageView.loadPreviewImage(GlideLocal(currentBook, 0))
    }

    override fun onLoadPreviewSuccessFirstRun() {
        supportStartPostponedEnterTransition()
        showEnterTransition()
    }

    override fun onLoadPreviewSuccessResume() {
        supportStartPostponedEnterTransition()
        previewImageView.isAnimatingTransition = false
        previewImageView.gone()
        onEnterTransitionFinished()
    }

    override fun onLoadPreviewFail() {
        supportStartPostponedEnterTransition()
        previewImageView.isAnimatingTransition = false
        previewImageView.gone()
        onEnterTransitionFinished()
    }

}